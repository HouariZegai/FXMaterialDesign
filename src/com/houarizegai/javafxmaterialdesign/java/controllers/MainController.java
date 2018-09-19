package com.houarizegai.javafxmaterialdesign.java.controllers;

import com.jfoenix.controls.JFXDialog;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML // Root Element
    private StackPane root;

    // Nodes
    private StackPane slideShowPane;
    private VBox recyclerViewPane, selectedViewPane, validAlertPane, invalidAlertPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            slideShowPane = FXMLLoader.load(getClass().getResource("/com/houarizegai/javafxmaterialdesign/resources/views/SlideShow.fxml"));
            recyclerViewPane = FXMLLoader.load(getClass().getResource("/com/houarizegai/javafxmaterialdesign/resources/views/RecyclerView.fxml"));
            selectedViewPane = FXMLLoader.load(getClass().getResource("/com/houarizegai/javafxmaterialdesign/resources/views/Selectedview.fxml"));
            validAlertPane = FXMLLoader.load(getClass().getResource("/com/houarizegai/javafxmaterialdesign/resources/views/validAlert.fxml"));
            invalidAlertPane = FXMLLoader.load(getClass().getResource("/com/houarizegai/javafxmaterialdesign/resources/views/InvalidAlert.fxml"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @FXML
    private void onSlideShow() {
        new JFXDialog(root, slideShowPane, JFXDialog.DialogTransition.CENTER).show();
    }

    @FXML
    private void onRecyclerView() {
        new JFXDialog(root, recyclerViewPane, JFXDialog.DialogTransition.CENTER).show();
    }

    @FXML
    private void onSelectedView() {
        new JFXDialog(root, selectedViewPane, JFXDialog.DialogTransition.CENTER).show();
    }

    @FXML
    private void onValidAlert() {
        new JFXDialog(root, validAlertPane, JFXDialog.DialogTransition.CENTER).show();
    }

    @FXML
    private void onInvalidAlert() {
        new JFXDialog(root, invalidAlertPane, JFXDialog.DialogTransition.CENTER).show();
    }

}
