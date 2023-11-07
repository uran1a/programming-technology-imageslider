module tasks.imageslider {
    requires javafx.controls;
    requires javafx.fxml;


    opens tasks.imageslider to javafx.fxml;
    exports tasks.imageslider;
    exports tasks.imageslider.controllers;
    opens tasks.imageslider.controllers to javafx.fxml;
}