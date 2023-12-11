module com.example.demomessenger {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.demomessenger to javafx.fxml;
    exports com.example.demomessenger;
}