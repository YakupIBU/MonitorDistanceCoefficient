module com.example.mmcalculator {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.mmcalculator to javafx.fxml;
    exports com.example.mmcalculator;
}