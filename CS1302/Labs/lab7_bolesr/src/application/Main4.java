package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;

public class Main4 extends Application {
	public static final int SPACING_BIG = 12;
	public static final int SPACING_SMALL = 2;
	protected TextField txfName;
	protected Button btnHellowWorld;
	protected TextArea txaMessage;
	protected ComboBox<String> cmbSalutation;
	protected ToggleGroup tGrpStyleChoice;

	@Override
	public void start(Stage primaryStage) {
		try {
			Pane root = buildGui();
			Scene scene = new Scene(root,340,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("h.world app");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public Pane buildGui() {

		VBox root = new VBox();
		root.setPadding(new Insets(25, 25, 25, 25));
		root.setSpacing(SPACING_BIG);

		HBox topRow = new HBox();
		topRow.setSpacing(SPACING_BIG);
		topRow.getChildren().add(this.nameEntryComponent());
		topRow.getChildren().add(this.buttonsComponent());
		
		HBox middleRow = new HBox();
		middleRow.setSpacing(SPACING_BIG);
		middleRow.getChildren().add(this.salutationComponent());
		middleRow.getChildren().add(this.messageStyleComponent());
		
		root.getChildren().add(topRow);
		root.getChildren().add(middleRow);
		root.getChildren().add(displayComponent());

		return root;
	}

	private Pane nameEntryComponent() {
		// Build name entry component
		HBox name = new HBox();
		name.setSpacing(SPACING_SMALL);

		Label lblName = new Label("Name:");
		name.getChildren().add(lblName);

		txfName = new TextField("");
		name.getChildren().add(txfName);

		return name;
	}

	private Pane buttonsComponent() {
		// Build buttons component
		HBox buttons = new HBox();
		buttons.setSpacing(SPACING_SMALL);

		Button btnShowMessage = new Button("Show Message");
		btnShowMessage.setOnAction(new ShowMessageEventHandler());
		buttons.getChildren().add(btnShowMessage);

		return buttons;
	}

	private Pane displayComponent() {
		// Build display area
		VBox display = new VBox();
		display.setSpacing(SPACING_SMALL);

		Label lblMessage = new Label("Message");
		display.getChildren().add(lblMessage);
		txaMessage = new TextArea();
		txaMessage.setPrefWidth(100);
		display.getChildren().add(txaMessage);

		return display;
	}
	
	private Pane salutationComponent() {
		// Build message salutation component
		VBox saluation = new VBox();
		saluation.setSpacing(SPACING_SMALL);

		Label lblSalutation = new Label("Salutation");
		saluation.getChildren().add(lblSalutation);

		cmbSalutation = new ComboBox<>();
		cmbSalutation.getItems().addAll("Mrs", "Ms", "Mr", "Dr");
		cmbSalutation.setValue("Mr");

		saluation.getChildren().add(cmbSalutation);

		return saluation;
	}

	private Pane messageStyleComponent() {
		// Build message style component
		VBox style = new VBox();
		style.setSpacing(SPACING_SMALL);

		Label lbl = new Label("Message Style");
		style.getChildren().add(lbl);

		tGrpStyleChoice = new ToggleGroup();

		RadioButton rbShort = new RadioButton("Short");
		rbShort.setToggleGroup(tGrpStyleChoice);
		rbShort.setSelected(true);
		style.getChildren().add(rbShort);

		RadioButton rbLong = new RadioButton("Long");
		rbLong.setToggleGroup(tGrpStyleChoice);
		style.getChildren().add(rbLong);

		return style;
	}
	
	private class ShowMessageEventHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			String name = txfName.getText();
			String salutation = cmbSalutation.getValue();
			String style = ((RadioButton)tGrpStyleChoice.getSelectedToggle()).getText();
			String msg = "Hello World, " + name;

			if(style.equals("Short")) {
				msg = "Hello world, " + salutation + " " + name + "!";
			}
			else if(style.equals("Long")) {
				msg = "It is a beautiful day, " + salutation + " " + name + "\n";
				msg += "    I hope you have a 'hello world' kind of day!";
			}
		    txaMessage.setText(msg);
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}