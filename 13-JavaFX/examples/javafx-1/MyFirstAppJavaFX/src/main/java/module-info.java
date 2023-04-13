module com.example.myfirstappjavafx {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens com.example.myfirstappjavafx to javafx.fxml;
    exports com.example.myfirstappjavafx;
}