package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javafx.event.ActionEvent;
import java.io.IOException;



public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    public void onHelloButtonClick (ActionEvent event) throws IOException {
        welcomeText.setText("Welcome to JavaFX Application!");

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("TEST.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("HelloRAYEN");
        stage.setScene(scene);
    }}



