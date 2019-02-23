package com.houarizegai.javafxmaterialdesign.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application {

    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/houarizegai/javafxmaterialdesign/resources/views/Main.fxml"));
            stage.setScene(new Scene(root));
            stage.setTitle("JavaFx Material Design");
            stage.show();

        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
