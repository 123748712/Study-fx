package application;

import java.awt.event.ActionEvent;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class Main05 extends Application {
	TextField tf_dan;
	TextArea ta_result;
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("main05.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			Button btn = (Button) scene.lookup("#btn");
			tf_dan = (TextField) scene.lookup("#tf_dan");
			ta_result = (TextArea) scene.lookup("#ta_result");

			btn.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					myClick();
				}
			});

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void myClick() {
		String dan = tf_dan.getText();
		int idan = Integer.parseInt(dan);
		
		String txt = "";
		
		for(int i = 1; i < 10; i++) {
			txt += dan + " * " + i + " = " + (idan*i) + "\n"; 
		}
		
		ta_result.setText(txt);
	}

	public static void main(String[] args) {
		launch(args);
	}
}