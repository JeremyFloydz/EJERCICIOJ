module org.example.ejej {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ejej to javafx.fxml;
    exports org.example.ejej;
}