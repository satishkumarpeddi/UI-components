module com.example.uicomponents {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uicomponents to javafx.fxml;
    exports com.example.uicomponents;
}