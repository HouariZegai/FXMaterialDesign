package com.houarizegai.fxmaterialdesign.controllers;

import javafx.fxml.FXML;

public class InvalidAlertController {

    @FXML
    private void onGoBack() {
        AlertController.invalidDialog.close();
    }

}
