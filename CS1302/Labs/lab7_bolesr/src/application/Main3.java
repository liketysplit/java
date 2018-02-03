package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main3 extends Application {

	TextField txfName;
	Button btnHellowWorld;
	TextArea txaMessage;

	public void start(Stage primaryStage) {
		try {
			 //Pane root = buildRoot();
			 //Pane root = buildGridGui();
			 //Pane root = buildSpacedGridGui();
			 //Pane root = buildVBoxGui();
			 Pane root = buildNestedGui();

			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setTitle("h.world app");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private BorderPane buildRoot() {
		BorderPane root = new BorderPane();
		txfName = new TextField("Type your name");
		root.setTop(txfName);
		Button btnHelloWorld = new Button("Hello World");
		btnHelloWorld.setOnAction(new HelloWorldButtonEventHandler());
		root.setCenter(btnHelloWorld);
		txaMessage = new TextArea();
		root.setBottom(txaMessage);
		return root;

	}
	
	public Pane buildGridGui() {
		GridPane pane = new GridPane();
		txfName = new TextField("Type your name");
		pane.add(txfName, 0, 0);
		Button btnHelloWorld = new Button("Hello World");
		btnHelloWorld.setOnAction(new HelloWorldButtonEventHandler());
		pane.add(btnHelloWorld, 0, 1);
		txaMessage = new TextArea();
		pane.add(txaMessage, 0, 2);
		return pane;	
	}
	
	public Pane buildSpacedGridGui() {
		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(25, 25, 25, 25));
		txfName = new TextField("Type your name");
		pane.add(txfName, 0, 0);
		Button btnHelloWorld = new Button("Hello World");
		btnHelloWorld.setOnAction(new HelloWorldButtonEventHandler());
		//GridPane.setMargin(btnHelloWorld, new Insets(0, 0, 0, 50));
		pane.add(btnHelloWorld, 0, 1);
		txaMessage = new TextArea();
		pane.add(txaMessage, 0, 2);
		return pane;
	}
	
	public Pane buildVBoxGui() {
		VBox pane = new VBox();
		txfName = new TextField("Type your name");
		pane.getChildren().add(txfName);
		Button btnHelloWorld = new Button("Hello World");
		btnHelloWorld.setOnAction(new HelloWorldButtonEventHandler());		
		pane.getChildren().add(btnHelloWorld);
		txaMessage = new TextArea();
		pane.getChildren().add(txaMessage);
		return pane;
	}
	
	public Pane buildNestedGui() {
		VBox root = new VBox();
		root.setPadding(new Insets(25, 25, 25, 25));
		root.setSpacing(25);

		HBox topPane = new HBox();
		topPane.setSpacing(25);
		Label lbl = new Label("Enter your name");
		txfName = new TextField("");
		topPane.getChildren().add(lbl);
		topPane.getChildren().add(txfName);

		root.getChildren().add(topPane);

		Button btnHelloWorld = new Button("Hello World");
		btnHelloWorld.setOnAction(new HelloWorldButtonEventHandler());
		root.getChildren().add(btnHelloWorld);

		txaMessage = new TextArea();
		root.getChildren().add(txaMessage);

		return root;
	}



	
	private class HelloWorldButtonEventHandler implements EventHandler<ActionEvent> {
		@Override
	    public void handle(ActionEvent e) {
	    	String name = txfName.getText();
	        txaMessage.setText(name + ", Hello World!");
	    }
	}


	public static void main(String[] args) {
		launch(args);
	}
}
