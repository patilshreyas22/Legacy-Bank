package com.jmc.LegacyBank.Controllers;

import com.jmc.LegacyBank.Controllers.Client.AccountsController;
import com.jmc.LegacyBank.Models.Model;
import com.jmc.LegacyBank.Views.AccountType;
import javafx.collections.FXCollections;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ChoiceBox<AccountType> acc_selector;
    public Label payee_address_lbl;
    public TextField payee_address_fld;
    public PasswordField password_fld;
    public Button login_btn;
    public Label error_lbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        acc_selector.setItems(FXCollections.observableArrayList(AccountType.CLIENT, AccountType.ADMIN));
        acc_selector.setValue(Model.getInstance().getViewFactory().getLoginAccountType());
        acc_selector.valueProperty().addListener(observable -> setAcc_selector());
        login_btn.setOnAction(event -> onLogin());
    }

    private void onLogin() {
        Stage stage = (Stage) error_lbl.getScene().getWindow();
        if (Model.getInstance().getViewFactory().getLoginAccountType() == AccountType.CLIENT) {
            // Evaluate Login Credentials
            Model.getInstance().evaluateClientCred(payee_address_fld.getText(), password_fld.getText());
            if(Model.getInstance().getClientLoginSuccessFlag()) {
                Model.getInstance().getViewFactory().showClientWindow();
                //Close the login stage
                Model.getInstance().getViewFactory().closeStage(stage);
            }else{
                payee_address_fld.setText("");
                password_fld.setText("");
                error_lbl.setText("No Such Login Credentials");
            }
        } else {
            //Evaluate Admin Login Credentials

            Model.getInstance().evaluateAdminCred(payee_address_fld.getText() , password_fld.getText());
            if(Model.getInstance().getAdminLoginSuccessFlag()) {
                Model.getInstance().getViewFactory().showAdminWindow();
                //close the login stage
                Model.getInstance().getViewFactory().closeStage(stage);
            }else {
                payee_address_fld.setText("");
                password_fld.setText("");
                error_lbl.setText("No Such Login Credentials");
            }
        }

    }

    private void setAcc_selector(){
        Model.getInstance().getViewFactory().setLoginAccountType(acc_selector.getValue());
        if(acc_selector.getValue() == AccountType.ADMIN) {
            payee_address_lbl.setText("Username:");

       }else{
            payee_address_lbl.setText("Payee Address:");
        }
   }
}
