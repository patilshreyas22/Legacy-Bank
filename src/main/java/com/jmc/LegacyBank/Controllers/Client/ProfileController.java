package com.jmc.LegacyBank.Controllers.Client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

import java.net.URL;
import java.util.ResourceBundle;

public class ProfileController implements Initializable {


    public Label nameValue;
    public Label passwordValue;
    public Label lastLoginValue;
    public PasswordField currentPasswordField;
    public PasswordField newPasswordField;
    public Button changePasswordButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
