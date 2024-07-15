module com.jmc.mazebank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;



    opens com.jmc.LegacyBank to javafx.fxml;
    exports com.jmc.LegacyBank;
    exports com.jmc.LegacyBank.Controllers;
    exports com.jmc.LegacyBank.Controllers.Admin;
    exports com.jmc.LegacyBank.Controllers.Client;
    exports com.jmc.LegacyBank.Models;
    exports com.jmc.LegacyBank.Views;
}
