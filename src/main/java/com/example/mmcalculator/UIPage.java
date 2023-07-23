package com.example.mmcalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class UIPage {
	@FXML
	private TextField fov1;
	@FXML
	private TextField fov2;
	@FXML
	private TextField monitorMatch;
	@FXML
	private TextField sensitivity;

	@FXML
	private void mmCalculator() {
		String fov_1s = fov1.getText();
		String fov_2s = fov2.getText();
		String monitorMatch_S = monitorMatch.getText();
		String sensitivity_S = sensitivity.getText();

		if (fov_1s.isEmpty() || fov_2s.isEmpty() || monitorMatch_S.isEmpty() || sensitivity_S.isEmpty()) {
			showAlert("ERROR!", "Fields cannot be empty");
			return;
		}

		try {
			double fov1 = Double.parseDouble(fov_1s);
			double fov2 = Double.parseDouble(fov_2s);
			double monitorMatch = Double.parseDouble(monitorMatch_S);
			double sensitivity = Double.parseDouble(sensitivity_S);

			double result = sensitivity * calc(fov2, monitorMatch) / calc(fov1, monitorMatch);
			showAlert("Result", "New Sensitivity: " + result);

		} catch (NumberFormatException ex) {
			showAlert("ERROR!", "Fields must be numbers");
		}
	}

	private double calc(double fov, double monitorMatch) {
		return Math.atan(monitorMatch / 100 * Math.tan(fov / 2 * Math.PI / 180));
	}

	private void showAlert(String title, String message) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.showAndWait();
	}
}
