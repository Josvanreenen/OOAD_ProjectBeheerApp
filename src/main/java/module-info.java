module ooad {
    requires javafx.controls;
    requires javafx.fxml;

    opens userInterfaceLaag to javafx.fxml;
    exports userInterfaceLaag;
}