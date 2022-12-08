package ua.fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ua.fx.HelloApplication;

public class FourthStepController {
    @FXML
    private Button aboutButton;
    @FXML
    private Button exitButton;
    @FXML
    private AnchorPane scenePane;
    Stage stage;

    @FXML
    void exitAction(ActionEvent event) {
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }

    @FXML
    void nextAction(ActionEvent event) {
        try {
            stage = (Stage) scenePane.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("about.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);

            stage.setTitle("Крок 5");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println("cannot open new window");
        }
    }
}
