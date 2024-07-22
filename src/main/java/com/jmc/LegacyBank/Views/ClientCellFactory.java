package com.jmc.LegacyBank.Views;

import com.jmc.LegacyBank.Controllers.Client.ClientCellController;
import com.jmc.LegacyBank.Models.Client;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

import java.io.IOException;

public class ClientCellFactory extends ListCell<Client> {
    @Override
    protected void updateItem(Client client, boolean empty) {
        super.updateItem(client, empty);

        if(empty){
            setText(null);
            setGraphic(null);
        }else{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Admin/ClientCell.fxml"));
            ClientCellController controller = new ClientCellController(client);
            loader.setController(controller);
            setText(null);
            try{
                setGraphic(loader.load());
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}
