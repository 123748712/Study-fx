package application;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

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
import javafx.scene.layout.BorderPane;

public class Main06 extends Application {
	Label lbl1;
	Label lbl2;
	Label lbl3;
	Label lbl4;
	Label lbl5;
	Label lbl6;

	@Override
	public void start(Stage primaryStage) {
		try {
//			BorderPane root = new BorderPane();
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("main06.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			Button btn = (Button) scene.lookup("#btn");
			lbl1 = (Label) scene.lookup("#lbl1");
			lbl2 = (Label) scene.lookup("#lbl2");
			lbl3 = (Label) scene.lookup("#lbl3");
			lbl4 = (Label) scene.lookup("#lbl4");
			lbl5 = (Label) scene.lookup("#lbl5");
			lbl6 = (Label) scene.lookup("#lbl6");

			btn.setOnMouseClicked(new EventHandler<Event>() { // 마우스 클릭했을때 event
				@Override
				public void handle(Event event) {
					lotto();
				}
			});

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void lotto() {
		String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
				, "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"
				, "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"
				, "31", "32", "33", "34", "35", "36", "37", "38", "39", "40"
				, "41", "42", "43", "44", "45"};
		
//		String[] arr = new String[45];
//		String a = "";
//		String b = "";
		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (i + 1) + "";
//		}
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(true) {
			int rnd = (int) (Math.random()*45);
			if(!arr[rnd].equals("0")) {
				list.add(arr[rnd]);
				arr[rnd] = "0";
			}
			if(list.size() >= 6) {
				break;
			}
		}
			lbl1.setText(list.get(0));
			lbl2.setText(list.get(1));
			lbl3.setText(list.get(2));
			lbl4.setText(list.get(3));
			lbl5.setText(list.get(4));
			lbl6.setText(list.get(5));
		
//		for(int i = 0; i < 45; i++) {
//			int rnd = (int) (Math.random()*45);
//			a = arr[0];
//			b = arr[rnd];
//			
//			arr[rnd] = a;
//			arr[0] = b;
//		}
//		lbl1.setText(arr[0]);
//		lbl2.setText(arr[1]);
//		lbl3.setText(arr[2]);
//		lbl4.setText(arr[3]);
//		lbl5.setText(arr[4]);
//		lbl6.setText(arr[5]);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
