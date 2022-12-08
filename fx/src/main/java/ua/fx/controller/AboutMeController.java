package ua.fx.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AboutMeController {
    @FXML
    private Button exitButton;
    @FXML
    private ComboBox<String> groupCombox;
    @FXML
    private ComboBox<String> markCombox;
    @FXML
    private AnchorPane scenePane;
    Stage stage;
    @FXML
    void exitAction(ActionEvent event) {
        stage=(Stage) scenePane.getScene().getWindow();
        stage.close();
    }
    ObservableList<String> markList= FXCollections.observableArrayList("1",
            "2","3" ,"4","5");
    ObservableList<String> groupList=
            FXCollections.observableArrayList("АнД-21", "КН-21","КН-22" );
    public void initialize () {
        markCombox.setItems(markList);
        groupCombox.setItems(groupList);
    }
}
