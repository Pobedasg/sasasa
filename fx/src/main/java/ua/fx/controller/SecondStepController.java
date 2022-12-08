package ua.fx.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ua.fx.HelloApplication;

public class SecondStepController {
    @FXML
    private Button exitButton;
    @FXML
    private Button nextButton;
    @FXML
    private ComboBox<String> educationField;
    @FXML
    private AnchorPane scenePane;
    private Stage stage;

    @FXML
    void exitAction(ActionEvent event) {
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }

    ObservableList<String> list = FXCollections.observableArrayList("середня неповна", "середня повна", "вища незакінчена", "бакалавр", "магістр");

    public void initialize() {
        educationField.setItems(list);
    }

    @FXML
    void nextAction(ActionEvent event) {
        try {
            stage = (Stage) scenePane.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("win3_sr2.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);

            stage.setTitle("Крок 2");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
