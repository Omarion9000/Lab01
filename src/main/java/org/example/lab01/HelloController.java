package org.example.lab01;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label messageLabel;

    @FXML
    protected void onHelloButtonClick() {
        messageLabel.setText("Welcome to Lab-01");
    }
}