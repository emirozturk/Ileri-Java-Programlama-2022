module com.emirozturk.uygulama4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.emirozturk.uygulama4 to javafx.fxml;
    exports com.emirozturk.uygulama4;
    exports com.emirozturk.uygulama4.Model;
    opens com.emirozturk.uygulama4.Model to javafx.fxml;
}