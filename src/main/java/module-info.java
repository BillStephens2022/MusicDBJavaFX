module com.billstephens.musicdbjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.billstephens.musicdbjavafx to javafx.fxml;
    exports com.billstephens.musicdbjavafx;
}