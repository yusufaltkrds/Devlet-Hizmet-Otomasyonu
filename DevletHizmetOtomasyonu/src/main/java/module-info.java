module otomasyon.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires fontawesomefx;


    opens otomasyon.demo to javafx.fxml;
    exports otomasyon.demo;
}