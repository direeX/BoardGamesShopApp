module com.example.petshopapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.petshopapp to javafx.fxml;
    exports com.example.petshopapp;
}