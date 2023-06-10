package com.example.petshopapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FXMLDocumentController {
//    .....................................
//    Pola z id od Scene Buildera:
    @FXML
    private Button close;

    @FXML
    private Button loginBtn;

    @FXML
    private AnchorPane main_form;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;
    //    .....................................

    public void close(){ // metoda do zamknięcia aplikacji przez button close
        System.exit(0);
    }
}