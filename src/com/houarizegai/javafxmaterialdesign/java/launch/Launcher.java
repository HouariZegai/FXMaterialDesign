package com.houarizegai.javafxmaterialdesign.java.launch;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application {

    @Override
    public void start(Stage stage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/com/houarizegai/javafxmaterialdesign/resources/views/Main.fxml"));
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("JavaFx Material Design");
        stage.show();
    }

}
