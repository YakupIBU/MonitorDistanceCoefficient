package com.example.mmcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("GUI.fxml")));
		primaryStage.setTitle(":)");
		primaryStage.setScene(new Scene(root, 200, 250));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
