package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main2 extends Application {

	TextField txfName;
	Button btnHellowWorld;
	TextArea txaMessage;

	public void start(Stage primaryStage) {
		try {
			BorderPane root = buildRoot();

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
