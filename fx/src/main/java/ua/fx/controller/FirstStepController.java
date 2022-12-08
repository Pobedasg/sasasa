package ua.fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ua.fx.HelloApplication;

import java.io.IOException;

public class FirstStepController {
    @FXML
    private Button exitButton;
    @FXML
    private TextField nameField;
    @FXML
    private Button nextButton;
    @FXML
    private AnchorPane scenePane;
    private Stage stage;

    @FXML
    void exitAction(ActionEvent event) {
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }

    @FXML
    void nextWindowAction(ActionEvent event) {
        try {
            stage = (Stage) scenePane.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("win2_sr2_2.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);

            stage.setTitle("Крок 1");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}