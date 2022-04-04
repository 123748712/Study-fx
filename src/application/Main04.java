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

public class Main04 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("main04.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			Button btn = (Button) scene.lookup("#btn");
			TextField tf_mine = (TextField) scene.lookup("#tf_mine");
			TextField tf_com = (TextField) scene.lookup("#tf_com");
			TextField tf_result = (TextField) scene.lookup("#tf_result");

			btn.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					String mine = tf_mine.getText();
					String com = "";
					String result = "";

					double rnd = Math.random();
					if (rnd > 0.5) {
						com = "홀";
					} else {
						com = "짝";
					}

					if (com.equals(mine)) {
						result = "승리";
					} else {
						result = "패배";
					}

					tf_com.setText(com);
					tf_mine.setText(mine);
					tf_result.setText(result);
				}
			});
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}