package com.houarizegai.javafxmaterialdesign.java.controllers;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class StepperTouchController implements Initializable {

    @FXML
    private Pane paneCounter;
    @FXML
    private Text txtCounter;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void onAdd() {
        if(Integer.parseInt(txtCounter.getText()) == 9)
            return;

        TranslateTransition tt = new TranslateTransition(Duration.millis(500), paneCounter);
        tt.setToX(115);
        tt.play();
        tt.setOnFinished(e -> {
            txtCounter.setText(String.valueOf(Integer.parseInt(txtCounter.getText()) + 1));
            TranslateTransition tt2 = new TranslateTransition(Duration.millis(500), paneCounter);
            tt2.setToX(0);
            tt2.play();
        });
    }

    @FXML
    private void onSub() {
        if(Integer.parseInt(txtCounter.getText()) == 0)
            return;

        TranslateTransition tt = new TranslateTransition(Duration.millis(500), paneCounter);
        tt.setToX(-115);
        tt.play();
        tt.setOnFinished(e -> {
            txtCounter.setText(String.valueOf(Integer.parseInt(txtCounter.getText()) - 1));
            TranslateTransition tt2 = new TranslateTransition(Duration.millis(500), paneCounter);
            tt2.setToX(0);
            tt2.play();
        });
    }

}
