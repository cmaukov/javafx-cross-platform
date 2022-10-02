module com.bmstechpro.fxcrossplat {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.bmstechpro.fxcrossplat to javafx.fxml;
    exports com.bmstechpro.fxcrossplat;
}