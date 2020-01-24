package com.houarizegai.fxmaterialdesign.controllers;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class SlideShowController implements Initializable {

    @FXML // Slider
    private VBox slide1, slide2, slide3;
    
    @FXML
    private JFXButton btnPrevious, btnNext;
    
    @FXML
    private Label lblPageNumber;
    
    // Max number of slider
    private static final byte NUMBER_OF_SLIDE = 3;
    
    private byte currentSlide = 1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnPrevious.setOnAction(e-> {
            if(currentSlide == 1) {
                return;
            }
            previousSlide(--currentSlide);
        });
        
        btnNext.setOnAction(e-> {
            if(currentSlide == NUMBER_OF_SLIDE) {
                return;
            }
            nextSlide(++currentSlide);
        });
        
    }    
    
    private void nextSlide(byte indexOfSlide) {
        lblPageNumber.setText(indexOfSlide + lblPageNumber.getText().substring(1));
        switch (indexOfSlide) {
            case 2:
                slide2.setVisible(true);
                TranslateTransition tt1 = new TranslateTransition(Duration.millis(800));
                tt1.setNode(slide1);
                tt1.setFromX(0.0);
                tt1.setToX(-384.0);
                tt1.setAutoReverse(false);
                tt1.play();
                
                tt1.setOnFinished(e -> {
                    slide1.setVisible(false);
                });
                btnPrevious.setId("btn2");
                btnNext.setId("btn2");
                break;
            case 3:
                slide3.setVisible(true);
                TranslateTransition tt2 = new TranslateTransition(Duration.millis(800));
                tt2.setNode(slide2);
                tt2.setFromX(0.0);
                tt2.setToX(-384.0);
                tt2.setAutoReverse(false);
                tt2.play();
                
                tt2.setOnFinished(e -> {
                    slide2.setVisible(false);
                });
                btnPrevious.setId("btn3");
                btnNext.setId("btn3");
                break;
                
        }
    }
    
    private void previousSlide(byte indexOfSlide) {
        lblPageNumber.setText(indexOfSlide + lblPageNumber.getText().substring(1));
        switch (indexOfSlide) {
            case 1:
                slide1.setVisible(true);
                TranslateTransition tt1 = new TranslateTransition(Duration.millis(800));
                tt1.setNode(slide1);
                tt1.setFromX(-384.0);
                tt1.setToX(0.0);
                tt1.setAutoReverse(false);
                tt1.play();
                
                tt1.setOnFinished(e -> {
                    slide2.setVisible(false);
                    btnPrevious.setId("btn1");
                    btnNext.setId("btn1");
                });
                break;
            case 2:
                slide2.setVisible(true);
                TranslateTransition tt2 = new TranslateTransition(Duration.millis(800));
                tt2.setNode(slide2);
                tt2.setFromX(-384.0);
                tt2.setToX(0.0);
                tt2.setAutoReverse(false);
                tt2.play();
                
                tt2.setOnFinished(e -> {
                    slide3.setVisible(false);
                    btnPrevious.setId("btn2");
                    btnNext.setId("btn2");
                });
                break;
        }
    }
}
