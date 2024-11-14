module dk.easv.mydemoproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.mydemoproject to javafx.fxml;
    exports dk.easv.mydemoproject;
}