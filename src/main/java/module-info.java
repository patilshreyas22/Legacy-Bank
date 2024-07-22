module com.jmc.LegacyBank {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires fontawesomefx;


    opens com.jmc.LegacyBank to javafx.fxml;
    exports com.jmc.LegacyBank;
    exports com.jmc.LegacyBank.Controllers;
    exports com.jmc.LegacyBank.Controllers.Admin;
    exports com.jmc.LegacyBank.Controllers.Client;
    exports com.jmc.LegacyBank.Models;
    exports com.jmc.LegacyBank.Views;


}
