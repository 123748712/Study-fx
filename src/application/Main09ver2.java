package application;
	
import java.awt.event.ActionEvent;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;


public class Main09ver2 extends Application {
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;
	Button btn9;
	Button btn0;
	Button btnCall;
	TextField tf;
	Alert alert;
	
	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("main09.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			tf = (TextField) scene.lookup("#tf");
			btn1 = (Button) scene.lookup("#btn1");
			btn2 = (Button) scene.lookup("#btn2");
			btn3 = (Button) scene.lookup("#btn3");
			btn4 = (Button) scene.lookup("#btn4");
			btn5 = (Button) scene.lookup("#btn5");
			btn6 = (Button) scene.lookup("#btn6");
			btn7 = (Button) scene.lookup("#btn7");
			btn8 = (Button) scene.lookup("#btn8");
			btn9 = (Button) scene.lookup("#btn9");
			btn0 = (Button) scene.lookup("#btn0");
			btnCall = (Button) scene.lookup("#btnCall");
			
			btn1.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					Button obj = (Button) event.getSource();
					call(event);
					
				}
			});
			btn2.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					Button obj = (Button) event.getSource();
					call(event);
					
				}
			});
			btn3.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					Button obj = (Button) event.getSource();
					call(event);
					
				}
			});
			btn4.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					Button obj = (Button) event.getSource();
					call(event);
					
				}
			});
			btn5.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					Button obj = (Button) event.getSource();
					call(event);
					
				}
			});
			btn6.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					Button obj = (Button) event.getSource();
					call(event);
					
				}
			});
			btn7.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					Button obj = (Button) event.getSource();
					call(event);
					
				}
			});
			btn8.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					Button obj = (Button) event.getSource();
					call(event);
					
				}
			});
			btn9.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					Button obj = (Button) event.getSource();
					call(event);
					
				}
			});
			btn0.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					Button obj = (Button) event.getSource();
					call(event);
					
				}
			});
			btnCall.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					callClick();
				}
			});
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void callClick() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("calling...");
		alert.setHeaderText(null);
		alert.setContentText(tf.getText());
		alert.showAndWait();
	}
	
	public void call(Event event) {
		Button temp = (Button) event.getSource();
		System.out.println(event.getSource());
		String str_old = tf.getText();
		String str_new = temp.getText();
		
		tf.setText(str_old + str_new);
		System.out.println("num : " + temp.getText());
	}

	public static void main(String[] args) {
		launch(args);
	}
}
