package com.houarizegai.javafxmaterialdesign.java.controllers;

import com.jfoenix.controls.JFXDialog;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AlertController implements Initializable {

    @FXML // Father of all components
    private StackPane root;

    private VBox validPane, invalidPane;

    public static JFXDialog validDialog, invalidDialog;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            validPane = FXMLLoader.load(getClass().getResource("/com/houarizegai/javafxmaterialdesign/resources/views/ValidAlert.fxml"));
            invalidPane = FXMLLoader.load(getClass().getResource("/com/houarizegai/javafxmaterialdesign/resources/views/InvalidAlert.fxml"));
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        validDialog = new JFXDialog(root, validPane, JFXDialog.DialogTransition.CENTER);
        invalidDialog = new JFXDialog(root, invalidPane, JFXDialog.DialogTransition.CENTER);
    }

    @FXML
    private void onValid() {
        validDialog.show();
    }

    @FXML
    private void onInvalid() {
        invalidDialog.show();
    }

    @FXML
    private void onClose() {
        Stage stage = (Stage) (root.getScene().getWindow());
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/houarizegai/javafxmaterialdesign/resources/views/Main.fxml"));
            stage.setScene(new Scene(root));
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
