package com.jmc.LegacyBank.Controllers.Client;

import com.jmc.LegacyBank.Models.Transaction;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class TransactionCellController implements Initializable {
    public Label trans_date_lbl;
    public FontAwesomeIcon out_icon;
    public FontAwesomeIcon in_icon;
    public Label sender_lbl;
    public Label receiver_lbl;
    public Label amount_lbl;

    private final Transaction transaction;

    public TransactionCellController(Transaction transaction) {
        this.transaction = transaction;
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {}
}
