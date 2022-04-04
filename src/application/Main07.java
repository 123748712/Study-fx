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

public class Main07 extends Application {
	TextField tf_first;
	TextField tf_last;
	TextArea ta;
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("main07.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			Button btn = (Button) scene.lookup("#btn");
			tf_first = (TextField) scene.lookup("#tf1");
			tf_last = (TextField) scene.lookup("#tf2");
			ta = (TextArea) scene.lookup("#ta");
			
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
		String first = tf_first.getText();
		String last = tf_last.getText();
		
		int firstInt = Integer.parseInt(first);
		int lastInt = Integer.parseInt(last);
		
		String txt = "";
		
		for(int i = firstInt; i <= lastInt; i++) {
			txt += drawStar(i);
		}
		ta.setText(txt);
	}
	public String drawStar(int cnt) { // 별 한줄을 리턴하는 메소드
		String ret = "";
		
		for(int i = 0; i < cnt; i++) {
			ret += "*";
		}
		ret += "\n";
		
		return ret;
	}

	public static void main(String[] args) {
		launch(args);
	}
}