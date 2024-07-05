module com.example.hr_management_manraj {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.hr_management_manraj to javafx.fxml;
    exports com.example.hr_management_manraj;
}