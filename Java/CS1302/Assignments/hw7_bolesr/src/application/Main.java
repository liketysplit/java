package application;
	
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Optional;
import java.util.Scanner;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import martian_stuff.GreenMartian;
import martian_stuff.Martian;
import martian_stuff.MartianManager;
import martian_stuff.RedMartian;


public class Main extends Application {
	
	protected static final int SPACING_BIG = 12;
	protected static final int SPACING_SMALL = 2;
	
	protected MartianManager mm = new MartianManager();
	protected ArrayList<Martian> martians = new ArrayList<>();
	protected Martian martian = null;
	
	protected ToggleGroup tGrpHasESP = new ToggleGroup();
	protected ToggleGroup tGrpIsVeg = new ToggleGroup();
	protected ToggleGroup tGrpRedGreen = new ToggleGroup();
	protected TextField txfAddMartian, txfIdSelection, txfLocation;
	protected Slider sliderVolume;
	protected RadioButton rbHasESPTrue, rbHasESPFalse, rbIsVegTrue, rbIsVegFalse, rbIsGreen, rbIsRed;
	protected Button btnAllRemove, btnRead, btnWrite, btnAdd, btnAllSpeak, btnRemoveMartian, btnMartianSpeak, btnTeleport, btnSetVolume,  btnGraphRefresh, btnSorted; 
	protected CheckBox cbEarth, cbMars, cbVenus;
	protected ComboBox<String> cmbMartianSelection;
	protected PieChart chart;
	protected ObservableList<String>  data = FXCollections.observableArrayList();
	protected ObservableList<PieChart.Data> pieChartData;
	protected PieChart.Data slice1;
	protected PieChart.Data slice2;
	protected double nRedMartians;
	protected double nGreenMartians;
	
	private TextArea statusBox;
	private HBox hBoxBottom;
	private VBox vBoxTop;
	private final String PATH = "src\\application";
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = buildGui(primaryStage);
			Scene scene = new Scene(root,900,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Martian Manager");
			primaryStage.show();
			

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Pane buildGui(Stage primaryStage){
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(0, 0, 25, 0));
		
		vBoxTop = new VBox();
		vBoxTop.setSpacing(SPACING_SMALL);
		vBoxTop.getChildren().add(tabbedPane(primaryStage));
		
		hBoxBottom = new HBox();
		hBoxBottom.getChildren().add(txtArea());

		root.setTop(vBoxTop);
		root.setBottom(hBoxBottom);
		
		return root;
	}
	
	private Pane txtArea(){
		HBox status = new HBox();
		status.setSpacing(SPACING_SMALL);
		status.setPadding(new Insets(25, 25, 25, 25));
		statusBox = new TextArea();
		statusBox.setEditable(false);
		statusBox.setPrefColumnCount(30);
		statusBox.setPrefRowCount(15);
		statusBox.setPrefWidth(850);
		statusBox.setPrefHeight(200);
		status.getChildren().add(statusBox);
		
		return status;
	}
	
	private TabPane tabbedPane(Stage primaryStage){
		TabPane tabbedPane = new TabPane();
		tabbedPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		
		//MartianCreation Tab
		Tab tabCreateMartian = new Tab();
		tabCreateMartian.setText("Create");
		tabCreateMartian.setContent(buildCreateMartianTab(primaryStage));;
		
		//MartianManager Tab
		Tab tabMartianManager = new Tab();
		tabMartianManager.setText("Martian Manager");
		tabMartianManager.setContent(buildMartianManagerTab(primaryStage));;
		

		//Graph Tab
		Tab tabGraph = new Tab();
		tabGraph.setText("Pie Graph");
		tabGraph.setContent(buildGraphTab());
		
		//Add children
		tabbedPane.getTabs().add(tabCreateMartian);
		tabbedPane.getTabs().add(tabMartianManager);
		tabbedPane.getTabs().add(tabGraph);
		
		return tabbedPane;
	}
	
	private Pane buildMartianManagerTab(Stage primaryStage){
		VBox vBoxOutside = new VBox();
		
		//Martian Selection
		HBox hbIdSelection = genericHBox();
		Label lblIdSelection = new Label("Select a single Martian by ID:");
		hbIdSelection.getChildren().add(lblIdSelection);
		
		txfIdSelection = new TextField();
		hbIdSelection.getChildren().add(txfIdSelection);
		
		btnMartianSpeak = new Button("Speak");
		hbIdSelection.getChildren().add(btnMartianSpeak);
		btnMartianSpeak.setOnAction(new MartianSpeakEventHandler());
		
		btnRemoveMartian = new Button("Remove Martian");
		btnRemoveMartian.setOnAction(new RemoveMartianEventHandler());
		hbIdSelection.getChildren().add(btnRemoveMartian);
		
		btnSetVolume = new Button("Set Volume");
		btnSetVolume.setOnAction(new SetVolumeEventHandler());
		hbIdSelection.getChildren().add(btnSetVolume);
		
		HBox hbComboBoxSelection = genericHBox();
		Label lblComboBoxSelection = new Label("Select a Martian from the list:");
		hbComboBoxSelection.getChildren().add(lblComboBoxSelection);
		cmbMartianSelection = new ComboBox<>(data);
		
		StringBuilder sb = new StringBuilder();
		for (Martian m : mm.sortedMartians()){
			if (m instanceof GreenMartian)
				sb.append(String.format("#d - Green", m.getId()));
			if (m instanceof RedMartian)
				sb.append(String.format("#d - Red", m.getId()));
		}
		cmbMartianSelection.getItems().add(sb.toString().trim());
		cmbMartianSelection.setOnAction(new ComboBoxEventHandler());
		hbComboBoxSelection.getChildren().add(cmbMartianSelection);

		//Teleport
		HBox hbLblSpacer = genericHBox();

		
		HBox hbCheckBoxes = genericHBox();
		cbEarth = new CheckBox("Earth");
		cbEarth.setSelected(false);
		cbVenus = new CheckBox("Venus");
		cbVenus.setSelected(false);
		cbMars = new CheckBox("Mars");
		cbMars.setSelected(false);
		hbCheckBoxes.getChildren().addAll(cbEarth, cbVenus, cbMars);
		
		HBox hbEnterLocation = genericHBox();
		Label lblEnterLocation = new Label("Group Teleport to a custom location or click a default location below:");
		hbEnterLocation.getChildren().add(lblEnterLocation);
		txfLocation = new TextField();
		hbEnterLocation.getChildren().add(txfLocation);
		btnTeleport = new Button("Teleport");
		btnTeleport.setOnAction(new TeleportEventHandler());
		hbEnterLocation.getChildren().add(btnTeleport);
		
		
		
		//Manager Buttons
		HBox hBoxButtons = genericHBox();
		hBoxButtons.setAlignment(Pos.BOTTOM_CENTER);
	
		btnRead = new Button("Read from File");
		hBoxButtons.getChildren().add(btnRead);
		btnRead.setOnAction(new ReadMartiansEventHandler(primaryStage));
		
		btnWrite = new Button("Write to File");
		hBoxButtons.getChildren().add(btnWrite);
		btnWrite.setOnAction(new WriteMartiansEventHandler(primaryStage));
		
		btnAllRemove = new Button("Remove Them All");
		hBoxButtons.getChildren().add(btnAllRemove);
		btnAllRemove.setOnAction(new RemoveAllMartiansEventHandler());
		
		btnAllSpeak = new Button("Group Speak");
		hBoxButtons.getChildren().add(btnAllSpeak);
		btnAllSpeak.setOnAction(e -> { statusBox.setText(mm.groupSpeak()); 
			if(mm.getNumMartians() == 0) statusBox.setText("There are no Martians?"); } );

		
		btnSorted = new Button("Sort Them");
		hBoxButtons.getChildren().add(btnSorted);
		btnSorted.setOnAction(new DisplaySortedEventHandler());


		
		vBoxOutside.getChildren().add(hbLblSpacer);
		vBoxOutside.getChildren().add(hbComboBoxSelection);
		vBoxOutside.getChildren().add(hbIdSelection);
		
		vBoxOutside.getChildren().add(hbEnterLocation);
		vBoxOutside.getChildren().add(hbCheckBoxes);
		vBoxOutside.getChildren().add(hBoxButtons);
		
		return vBoxOutside;
	}
	
private Pane buildCreateMartianTab(Stage primaryStage){
		
		

	VBox vBoxOutside = new VBox();

	GridPane topGridPane = buildTopGridPane();

	GridPane bottomGridPane = buildBottomGridPane();
	
	//Labels
	Label lblId = new Label("ID:");
	Label lblVolume = new Label("Volume:");
	Label lblHasEsp = new Label("Esp:");
	Label lblIsVeg = new Label("Vegetarian:");
	Label lblMartian = new Label("Red or Green:");
	
	//Id textField
	txfAddMartian = new TextField();
	txfAddMartian.setPrefWidth(600);
	
	//Volume Slider
	sliderVolume = new Slider(0, 8, 1);
	sliderVolume.setShowTickLabels(true);
	sliderVolume.setShowTickMarks(true);
	sliderVolume.setSnapToTicks(true);
	sliderVolume.setMinorTickCount(0);
	sliderVolume.setMajorTickUnit(1);
	sliderVolume.setPrefWidth(200);
	
	//Red and Green RadioButton
	rbIsRed = new RadioButton("Red Martian");
	rbIsRed.setToggleGroup(tGrpRedGreen);
	rbIsRed.setSelected(true);
	
	rbIsGreen = new RadioButton("Green Martian");
	rbIsGreen.setToggleGroup(tGrpRedGreen);
	
	//ESP RadioButton
	rbHasESPTrue = new RadioButton("Yes");
	rbHasESPTrue.setToggleGroup(tGrpHasESP);
	
	rbHasESPFalse = new RadioButton("No");
	rbHasESPFalse.setToggleGroup(tGrpHasESP);
	rbHasESPFalse.setSelected(true);
	
	//VEG RadioButton
	rbIsVegTrue = new RadioButton("Yes");
	rbIsVegTrue.setToggleGroup(tGrpIsVeg);
	
	rbIsVegFalse = new RadioButton("No");
	rbIsVegFalse.setToggleGroup(tGrpIsVeg);
	rbIsVegFalse.setSelected(true);
	
	//Button HBox
	HBox hBoxButtons = genericHBox();
	hBoxButtons.setAlignment(Pos.BOTTOM_RIGHT);

	btnAdd = new Button("Add Martian");
	hBoxButtons.getChildren().add(btnAdd);
	btnAdd.setOnAction(new CreateMartianEventHandler());
	
	Label hbLbl = new Label("Please Form to Completion:");
	
	//Top GridPane
	topGridPane.add(hbLbl, 0, 0);
	topGridPane.add(lblId, 0, 1);
	topGridPane.add(txfAddMartian, 1, 1);
	
	topGridPane.add(lblVolume, 0, 2);
	topGridPane.add(sliderVolume, 1, 2);
	
	//Bottom GridPane
	bottomGridPane.add(lblMartian, 0, 0);
	bottomGridPane.add(rbIsRed, 1, 0);
	bottomGridPane.add(rbIsGreen, 2, 0);
	
	bottomGridPane.add(lblHasEsp, 0, 1);
	bottomGridPane.add(rbHasESPTrue, 1, 1);
	bottomGridPane.add(rbHasESPFalse, 2, 1);
	
	bottomGridPane.add(lblIsVeg, 0, 2);
	bottomGridPane.add(rbIsVegTrue, 1, 2);
	bottomGridPane.add(rbIsVegFalse, 2, 2);
	
	Label hbLblSpacer = new Label();
	Label hbLblSpacer1 = new Label();
	Label hbLblSpacer2 = new Label();
	
	//vBoxOutside
	vBoxOutside.getChildren().add(hbLblSpacer);
	vBoxOutside.getChildren().add(hbLblSpacer1);
	vBoxOutside.getChildren().add(hbLblSpacer2);
	vBoxOutside.getChildren().add(topGridPane);
	vBoxOutside.getChildren().add(bottomGridPane);
	vBoxOutside.getChildren().add(hBoxButtons);
	
	return vBoxOutside;
	}
	
	

	
	private Pane buildGraphTab(){
		VBox vBoxOutside = new VBox();
		
		chart = buildPieChart();
		
		HBox hbBtnRefresh = genericHBox();
		btnGraphRefresh = new Button("Refresh Graph");
		hbBtnRefresh.getChildren().add(btnGraphRefresh);
		btnGraphRefresh.setOnAction(new GraphRefreshEventHandler());
		
		vBoxOutside.getChildren().add(chart);
		vBoxOutside.getChildren().add(hbBtnRefresh);
		return vBoxOutside;
	}
	
	private HBox genericHBox(){
		HBox temp = new HBox();
		temp.setPadding(new Insets(25, 25, 25, 25));
		temp.setSpacing(15);
		return temp;
	}
	private VBox genericVBox(){
		VBox temp = new VBox();
		temp.setPadding(new Insets(25, 25, 25, 25));
		temp.setSpacing(25);
		return temp;
	}
	private VBox lblVBox(){
		VBox temp = new VBox();
		temp.setPadding(new Insets(25, 25, 25, 25));
		temp.setSpacing(100);
		return temp;
	}
	
    private File getInFile(Stage stage) {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        File initPath = new File(PATH);
        fileChooser.setInitialDirectory(initPath);
        File file = fileChooser.showOpenDialog(stage);
        System.out.println(file);
		return file;
    }

    private File getOutFile(Stage stage) {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        File initPath = new File(PATH);
        fileChooser.setInitialDirectory(initPath);
        File file = fileChooser.showSaveDialog(stage);
        System.out.println(file);
		return file;
    }
    
    private GridPane buildTopGridPane(){
    	GridPane gpTop = new GridPane();
    	gpTop.setHgap(40);
    	gpTop.setVgap(20);
    	gpTop.setPadding(new Insets(25, 25, 25, 25));
    	return gpTop;
    }
    
    private GridPane buildBottomGridPane(){
    	GridPane gpBottom = new GridPane();
    	gpBottom.setHgap(10);
    	gpBottom.setVgap(20);
    	gpBottom.setPadding(new Insets(10, 25, 25, 25));
    	return gpBottom;
    }
   
    private void readMartiansFile(File file)throws FileNotFoundException{
    	File inFile = file;
    	int id;
    	int volume = -1;
    	boolean hasESP = false;
    	boolean isVeg = false;
    	try{
    		Scanner sc = new Scanner(inFile);
    		while (sc.hasNext()){
    			char next = sc.next().charAt(0);
    			martian = null;
    			if(next == 'R'){
    				int count = 0;
    				id = sc.nextInt(); count++;
   
    				if (sc.hasNextInt())
    					volume = sc.nextInt();count++;
    				
    				if (sc.hasNext("t")){
    					hasESP = true; count++; sc.next();
    					if (sc.hasNext("t")){
        					isVeg = true;count++; sc.next();
        				}
        				if (sc.hasNext("f")){
        					isVeg = false;count++; sc.next();
        				}
    				}
    				if (sc.hasNext("f")){
    					hasESP = false;count++; sc.next();
    					if (sc.hasNext("t")){
        					isVeg = true;count++; sc.next();
        				}
        				if (sc.hasNext("f")){
        					isVeg = false;count++; sc.next();
        				}
    				}
    				
    				martian = new RedMartian(id);
    				switch(count){
    				case 3: martian = new RedMartian(id, hasESP, isVeg);
    				case 4: martian = new RedMartian(id, volume, hasESP, isVeg);
    				}
    				
    				if (martian != null){	
    					if(mm.addMartian(martian)){
    						data.addAll(martian.getId() + " - Red");
    						martians.add(martian);
    						nRedMartians++;
    					}
    				}
    			}
    			if (next == 'G'){
    				int count = 0;
    				id = sc.nextInt(); count++;
    				
    				if (sc.hasNextInt())
    					volume = sc.nextInt();count++; 

    				if (sc.hasNext("t")){
    					hasESP = true; count++; sc.next();
    					if (sc.hasNext("t")){
        					isVeg = true;count++; sc.next();
        				}
        				if (sc.hasNext("f")){
        					isVeg = false;count++; sc.next();
        				}
    				}
    				if (sc.hasNext("f")){
    					hasESP = false;count++; sc.next();
    					if (sc.hasNext("t")){
        					isVeg = true;count++; sc.next();
        				}
        				if (sc.hasNext("f")){
        					isVeg = false;count++; sc.next();
        				}
    				}

    				martian = new GreenMartian(id);
    				switch(count){
    				case 3: martian = new GreenMartian(id, hasESP, isVeg);
    				case 4: martian = new GreenMartian(id, volume, hasESP, isVeg);
    				}

    				if (martian != null){	
    					if(mm.addMartian(martian)){
    						data.addAll(martian.getId() + " - Green");
    						martians.add(martian);
    						nGreenMartians++;
    					}
    				}
    			}
    			else
    				sc.nextLine();
    		}
    		sc.close();
    		statusBox.setText(mm.groupSpeak());
    	}catch(IOException e){
    		statusBox.setText(e.toString());
    	}
    }

    private void writeMartiansFile(File file)throws FileNotFoundException{
    	File outFile = file;
    	
    	try{
    		PrintWriter writer = new PrintWriter(outFile);
    		
    		for (Martian m : martians){
    			String sHasESP = " ";
    			String sIsVeg = " ";
    			if(m instanceof RedMartian  ){
    				if(m.hasESP())
    					sHasESP = "t";
    				if(m.isVegetarian())
    					sIsVeg = "t";
    				if(!m.hasESP())
    					sHasESP = "f";
    				if(!m.isVegetarian())
    					sIsVeg = "f";
    				
    				writer.print("R " + m.getId() + " " + m.getVolume() + " " + sHasESP + " " + sIsVeg + "\n" );
    			}
    			if( m instanceof GreenMartian){
    				if(m.hasESP())
    					sHasESP = "t";
    				if(m.isVegetarian())
    					sIsVeg = "t";
    				if(!m.hasESP())
    					sHasESP = "f";
    				if(!m.isVegetarian())
    					sIsVeg = "f";
    				
    				writer.print("G " + m.getId() + " " + m.getVolume() + " " + sHasESP + " " + sIsVeg + "\n" );
    			}
    			
    		}
    		writer.close();
    	}catch(IOException e){
    		System.out.print(e);
    	}
    }
    
    private PieChart buildPieChart(){
		pieChartData = getChartData();
		chart = new PieChart(pieChartData);
		chart.setTitle("Red vs Green Martians");
		chart.setLegendVisible(false);
		
	    applyCustomColorSequence(
	    	      pieChartData, 
	    	      "green", 
	    	      "red");
		return chart;
    }
    
    private ObservableList<PieChart.Data> getChartData(){

		pieChartData = FXCollections.observableArrayList();
		PieChart.Data slice1 = new PieChart.Data("Green Martians", nGreenMartians);
		PieChart.Data slice2 = new PieChart.Data("Red Martians", nRedMartians);
		pieChartData.addAll(slice1, slice2);

		return pieChartData;
    }
    
    private void updateChartData(String name, double value){
    	for (Data d : pieChartData){
    		if(d.getName().equals(name)){
    			d.setPieValue(value);
    			return;
    		}
    	}
    }
    
    private void applyCustomColorSequence(ObservableList<PieChart.Data> pieChartData, String... pieColors) {
        int i = 0;
        for (PieChart.Data data : pieChartData) {
          data.getNode().setStyle("-fx-pie-color: " + pieColors[i % pieColors.length] + ";");
          i++;
        }
      }
    
    private class ReadMartiansEventHandler implements EventHandler<ActionEvent> {
    	Stage stage;
    	public ReadMartiansEventHandler(Stage stage){
    		super();
    		this.stage = stage;
    	}
    	@Override
    	public void handle(ActionEvent event){
    		File file = getInFile(stage);
    		if(file != null){
    			try{
    				readMartiansFile(file);
    				statusBox.setText("Success\n\n");
    				
    			}catch(FileNotFoundException e){
    				statusBox.setText("Error");
    				e.printStackTrace();
    			}
    		}
    	}
    }
    
    private class WriteMartiansEventHandler implements EventHandler<ActionEvent>{
    	Stage stage;
    	public WriteMartiansEventHandler(Stage stage){
    		super();
    		this.stage = stage;
    	}
    	@Override
    	public void handle(ActionEvent event){
    		
    		if (martians.isEmpty()){
    			statusBox.setText("There are no Martians?");
    			return;
    		}
    		
    		File file = getOutFile(stage);
    		
    		if (file != null){
    			try{
    				writeMartiansFile(file);
    				statusBox.setText("writeMartiansFile() was called successfully\n\n");
    				statusBox.appendText("File Name: " + file.getName());
    			}catch(FileNotFoundException e){
    				statusBox.setText("Error reading file");
    				e.printStackTrace();
    			}
    		}
    	}
    }
    
    private class CreateMartianEventHandler implements EventHandler<ActionEvent>{
		@Override
    	public void handle(ActionEvent event){
			

			
			StringBuilder message = new StringBuilder();
			try{
				int id = Integer.parseInt(txfAddMartian.getText());
	    		int volume = (int) sliderVolume.getValue();
	    		boolean hasESP = !(rbHasESPFalse.isSelected());
	    		boolean isVeg = !(rbIsVegFalse.isSelected());
	    		
	    		if (rbIsGreen.isSelected()){
	    			martian = new GreenMartian(id, volume, hasESP, isVeg);
	    		}
	    		if(rbIsRed.isSelected()){
	    			martian = new RedMartian(id, volume, hasESP, isVeg);
	    		}
	    		

	    		boolean isCreated = mm.addMartian(martian);

	    		
	    		if(rbIsGreen.isSelected() && isCreated){
	    			message.append("Martian added. \n");
	    			message.append(String.format("\n\tId: %d, \n\tVolume: %d, \n\tColor: %s \n\tESP: %b, \n\tVeg: %b"
	    					, martian.getId(), martian.getVolume(), "Green", rbHasESPTrue.isSelected(), rbIsVegTrue.isSelected()));
	    			data.addAll(martian.getId() + " - Green");
	    			martians.add(martian);
	    			nGreenMartians++;
	    		}
	    		if(martian instanceof RedMartian && isCreated){
	    			message.append("Martian added. \n");
	    			message.append(String.format("\n\tId: %d, \n\tVolume: %d, \n\tColor: %s \n\tESP: %b, \n\tVeg: %b"
	    					, martian.getId(), martian.getVolume(), "Red", rbHasESPTrue.isSelected(), rbIsVegTrue.isSelected()));
	    			data.addAll(martian.getId() + " - Red");
	    			martians.add(martian);
	    			nRedMartians++;
	    		}
	    		if (!isCreated){
	    			message.append(String.format("Martian with ID: %d already exists! \n"
	    					, martian.getId()));
	    		}
			}catch(NumberFormatException e){

				Alert alert = new Alert(AlertType.WARNING, "1. You must enter an id\n2."
						+ "The id must contain only numbers\n3.The id must be unique. Use the All Martians Speak button to check current Martians.", ButtonType.OK);
				alert.showAndWait();
				
				if (alert.getResult() == ButtonType.APPLY)
					alert.close();
			}

    		statusBox.setText(message.toString());

    		txfAddMartian.setText(null);
    	}
    }
	
    private class DisplaySortedEventHandler implements EventHandler<ActionEvent>{
    	@Override
    	public void handle(ActionEvent event){
    		
    		if (martians.isEmpty()){
    			statusBox.setText("There are no Martians?"); 
    			return;
    		}
    		
    		StringBuilder sb = new StringBuilder();
    		for (Martian m : mm.sortedMartians()){
    			sb.append(String.format("%s \n", m.toString()));
    		}
    		
    		statusBox.setText(sb.toString());
    			
    	}
    }
    
    private class RemoveAllMartiansEventHandler implements EventHandler<ActionEvent>{
    	
    	@Override
    	public void handle(ActionEvent event){
    		StringBuilder message = new StringBuilder();
    		
    		if (martians.isEmpty()){
    			statusBox.setText("There are no Martians?"); 
    			return;
    		}
    		
    		try{
    			
    			Alert alert = new Alert(AlertType.CONFIRMATION, "Delete All Martians?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
    			alert.showAndWait();

    			if (alert.getResult() == ButtonType.YES) {
    				mm.obliterateMartians(); message.append("All Martians Obliterated!");
    				data.clear();
    				martians.clear();
    				cmbMartianSelection.getItems().removeAll();
    				nRedMartians = 0; nGreenMartians = 0;
    				alert.close();
    			}
    			if (alert.getResult() == ButtonType.NO){
    				alert.close();
    			}
    			if (alert.getResult() == ButtonType.CANCEL){
    				alert.close();
    			}
    		}catch(NullPointerException e){
    			statusBox.setText("NullPointerError");
    		}catch(RuntimeException e){
    			statusBox.setText("Runtime Error");
    		}
    	
    		
    		statusBox.setText(message.toString());
    	}
    }
	
    private class ComboBoxEventHandler implements EventHandler<ActionEvent>{
    	@Override
    	public void handle(ActionEvent event){

    		if(cmbMartianSelection.getValue().isEmpty())
    			return;
    			
    		int martianIndex = Integer.MAX_VALUE;
    		try{
	    		String temp = cmbMartianSelection.getValue().toString();
	    		String[] parts = temp.split("\\- ");
	    		int id = Integer.parseInt(parts[0].trim());
	
	    		statusBox.setText(mm.getMartianWithId(id).toString());

    		}catch(ConcurrentModificationException r){
    			System.out.print(r);
    		}catch(NullPointerException e){
    			System.out.print(e);
    		}
    	}
    }
	
    private class RemoveMartianEventHandler implements EventHandler<ActionEvent>{
    	@Override
    	public void handle(ActionEvent event){

    		if(txfIdSelection.getText().isEmpty()){
    			statusBox.setText("You must enter an ID to uset this command!");
    			return;
    		}
    		try{

	    		statusBox.clear();
	    		if (txfIdSelection.equals("")){
	    			statusBox.setText("Enter an ID");
	    			return;
	    		}
	    		Alert alert = new Alert(AlertType.CONFIRMATION, String.format(String.format("Delete Martian %s?", txfIdSelection.getText()) , ButtonType.YES, ButtonType.NO, ButtonType.CANCEL));
				alert.showAndWait();
				
				if(alert.getResult() == ButtonType.OK){
					
					if (martians.isEmpty())
						statusBox.setText("There are no Martians?");
					
					for (Martian m : martians){
						if (m.getId() == Integer.parseInt(txfIdSelection.getText().trim())){
							mm.removeMartian(m);
							statusBox.setText("Removal Successful!");
							cmbMartianSelection.getItems().remove(martians.indexOf(m)+1);
							martians.remove(m);
							alert.close();
							statusBox.appendText("\n" + m.toString() + " has been nuked!");
							if(m instanceof GreenMartian)
								nGreenMartians--;
							else 
								nRedMartians--;

							}
	
						else{
							statusBox.setText("Remove failed. Martian not found.");
						}
					}
				}
				if(alert.getResult() == ButtonType.CANCEL){
					statusBox.setText("Remove failed.");
					alert.close();
				}
				txfIdSelection.setText(null);
    		}catch(ConcurrentModificationException c){
    			System.out.print(c);
    		}
    	}
    }
    
    private class MartianSpeakEventHandler implements EventHandler<ActionEvent>{
    	@Override
    	public void handle(ActionEvent event){
    		
    		if (martians.isEmpty()){
    			statusBox.setText("There are no Martians?");
    			return;
    		}
    		
    		int temp = Integer.parseInt(txfIdSelection.getText());
    		statusBox.clear();
    		for (Martian m : mm.sortedMartians()){
	    		if(temp == m.getId()){
	    			statusBox.setText(mm.getMartianWithId(temp).speak()); return;
	    		}
    			else
    				statusBox.setText("Martian not found!");
    		}	
    			
    	}
    }
    
    private class SetVolumeEventHandler implements EventHandler<ActionEvent>{
    	@Override
    	public void handle(ActionEvent event){
    		boolean has = false;
    		
    		if (martians.isEmpty()){
    			statusBox.setText("There are no Martians?");
    			return;
    		}
    		
    		for (Martian m : martians) 
    			if (m == mm.getMartianWithId(Integer.parseInt(txfIdSelection.getText() )))
    				has = true;
    			if(!has){ 
    				statusBox.setText(String.format("The Martian with %s does not exist!", txfIdSelection.getText()));
    				return;
    			}
    		
    		
    		TextInputDialog dialog = new TextInputDialog();
    		dialog.setTitle(String.format("Set %d's Volme", Integer.parseInt(txfIdSelection.getText())));
    		dialog.setHeaderText(null);
    		dialog.setContentText("Set Volume: ");
    		
    		Optional<String> s = dialog.showAndWait();
    		if(s.isPresent()){
    			try{
    				int i = Integer.parseInt(s.get());
    				int oldVolume = mm.getMartianWithId(Integer.parseInt(txfIdSelection.getText())).getVolume();
    				if (i > 0 && i <= 8){
    					mm.getMartianWithId(Integer.parseInt(txfIdSelection.getText())).setVolume(i);
    					statusBox.setText(String.format("Martian %d's new volume is: %d\n\t Old Volume: %d"
    							, Integer.parseInt(txfIdSelection.getText()), i, oldVolume));
    				}
    				else 
    					statusBox.setText("Failure. Volume must be 0 - 8.");
    			}catch(NumberFormatException e){
    				statusBox.setText("You must enter a number 0 - 8.");
    			}
    		}
    		
    	}
    }
    
    private class TeleportEventHandler implements EventHandler<ActionEvent>{
    	@Override
    	public void handle(ActionEvent event){
    		
    		if (martians.isEmpty()){
    			statusBox.setText("There are no Martians?");
    			return;
    		}
    		
    		if (mm.getNumTeleporters() == 0){
    			statusBox.setText("No Teleporters!");
    			return;
    		}
    			
    		    		
    		StringBuilder sb = new StringBuilder();
    		try{
    			if (cbEarth.isSelected())
    				sb.append(mm.groupTeleport("Earth") + "\n");
    			if (cbVenus.isSelected())
    				sb.append(mm.groupTeleport("Venus") + "\n");
    			if (cbMars.isSelected())
    				sb.append(mm.groupTeleport("Mars") + "\n");
    			if (!txfLocation.getText().isEmpty())
    				sb.append(mm.groupTeleport(txfLocation.getText()));
    			
    			statusBox.setText(sb.toString());
    		}catch(RuntimeException e){
    			System.out.print(e);
    		}
    	}
    }
    
    private class GraphRefreshEventHandler implements EventHandler<ActionEvent>{
    	@Override
    	public void	 handle(ActionEvent event){

    		updateChartData("Red Martians", nRedMartians);
    		updateChartData("Green Martians", nGreenMartians);
    		statusBox.setText(pieChartData.toString());
    	}
    }
    
    public static void main(String[] args) {
		launch(args);
	}
}