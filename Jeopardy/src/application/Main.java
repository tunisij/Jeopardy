package application;

import java.io.IOException;
import java.util.concurrent.Executor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
	
	private Button button;
	private HBox hbButton;
	private final Text actiontarget = new Text();
	private TextField userTextField;
	private Label userName;
	private Label pw;
	private PasswordField pwBox;
	String user = "tunisij";
	String password = "password";
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
//			GridPane root = new GridPane();
//			root.setAlignment(Pos.CENTER);
//			root.setHgap(10);
//			root.setVgap(10);
//
//			Text scenetitle = new Text("This is Jeopardy!");
//			scenetitle.setId("sceneTitle");
//			root.add(scenetitle, 0, 0, 2, 1);
//			
//			userName = new Label("User Name:");
//			root.add(userName, 0, 1);
//
//			userTextField = new TextField();
//			root.add(userTextField, 1, 1);
//
//			pw = new Label("Password:");
//			root.add(pw, 0, 2);
//
//			pwBox = new PasswordField();
//			root.add(pwBox, 1, 2);
//			
//			button = new Button("Sign in");
//			hbButton = new HBox(10);
//			hbButton.setAlignment(Pos.BOTTOM_RIGHT);
//			hbButton.getChildren().add(button);
//			root.add(hbButton, 1, 4);
//			root.add(actiontarget, 1, 6);
//			
//			button.setOnAction(new EventHandler<ActionEvent>(){
//
//				@Override
//				public void handle(ActionEvent e){
////					if(userTextField.getText().equals(user) && pwBox.getText().equals(password))
//					
//					actiontarget.setText("Invalid login");
//					actiontarget.setId("actionTarget");
//				}
//			});
//			
			Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("jeopardy.fxml"));
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Jeopardy!");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) {
//		launch(args);
//	}
}
