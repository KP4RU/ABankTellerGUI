module com.example.banktellergui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.abanktellergui to javafx.fxml;
    exports com.example.abanktellergui;
}