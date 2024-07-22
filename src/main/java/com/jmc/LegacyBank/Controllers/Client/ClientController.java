package com.jmc.LegacyBank.Controllers.Client;

import com.jmc.LegacyBank.Models.Model;
import com.jmc.LegacyBank.Views.ClientMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {

    public BorderPane client_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observableValue, oldValue, newVal) -> {
            if (newVal != null) {
                switch (newVal) {
                    case TRANSACTIONS -> client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionsView());
                    case ACCOUNTS -> client_parent.setCenter(Model.getInstance().getViewFactory().getAccountsView());
                    case PROFILE -> client_parent.setCenter(Model.getInstance().getViewFactory().getProfileView());
                    default -> client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
                }
            }
        });
    }
}
