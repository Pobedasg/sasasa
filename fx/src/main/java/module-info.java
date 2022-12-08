module ua.fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens ua.fx to javafx.fxml;
    exports ua.fx;
    exports ua.fx.controller;
    opens ua.fx.controller to javafx.fxml;
}