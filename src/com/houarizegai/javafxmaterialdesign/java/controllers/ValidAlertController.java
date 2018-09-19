package com.houarizegai.javafxmaterialdesign.java.controllers;

import javafx.fxml.FXML;

public class ValidAlertController {

    @FXML
    private void onDone() {
        AlertController.validDialog.close();
    }

}
