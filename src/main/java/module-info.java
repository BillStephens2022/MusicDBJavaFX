module com.billstephens.musicdbjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.billstephens.musicdbjavafx to javafx.fxml;
    opens com.billstephens.musicdbjavafx.model to javafx.base;
    exports com.billstephens.musicdbjavafx;
}