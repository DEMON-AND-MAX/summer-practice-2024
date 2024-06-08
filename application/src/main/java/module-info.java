module com.haufe.application {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.haufe.application to javafx.fxml;
    exports com.haufe.application;
}