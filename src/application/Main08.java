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
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class Main08 extends Application {
	TextField tf_mine;
	TextField tf_com;
	TextField tf_result;
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("main08.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			Button btn = (Button) scene.lookup("#btn");
			tf_mine = (TextField) scene.lookup("#tf_mine");    
			tf_com = (TextField) scene.lookup("#tf_com");      
			tf_result = (TextField) scene.lookup("#tf_result");

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
		String mine = tf_mine.getText();
		String com = "";
		String result = "";
		int rnd = (int) Math.random();
		if(rnd < 0.33) {
			com = "가위";
		} else if (rnd < 0.66) {
			com = "바위";
		} else {
			com = "보";
		}
		
		tf_com.setText(com);
		
		if(mine.equals(com)) {
			result = "비김";
		} else if(mine.equals("가위") && com.equals("바위") || mine.equals("바위") && com.equals("보") || mine.equals("보") && com.equals("가위")) {
			result = "패배";
		} else {
			result = "승리";
		}
		tf_com.setText(com);
		tf_result.setText(result);
	}

	public static void main(String[] args) {
		launch(args);
	}
}