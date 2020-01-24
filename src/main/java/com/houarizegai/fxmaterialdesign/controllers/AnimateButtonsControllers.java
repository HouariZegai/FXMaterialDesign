package com.houarizegai.fxmaterialdesign.controllers;

import animatefx.animation.Bounce;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class AnimateButtonsControllers implements Initializable {
    @FXML
    private Circle cir1, cir2, cir3, cir4;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        new Bounce(cir1).setCycleDuration(4).setCycleCount(10).setDelay(Duration.millis(500)).play();
        new Bounce(cir2).setCycleDuration(4).setCycleCount(10).setDelay(Duration.millis(1000)).play();
        new Bounce(cir3).setCycleDuration(4).setCycleCount(10).setDelay(Duration.millis(1500)).play();
        new Bounce(cir4).setCycleDuration(4).setCycleCount(10).setDelay(Duration.millis(2000)).play();
    }
}
