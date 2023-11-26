module com.mycompany.login {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.login to javafx.fxml;
    exports com.mycompany.login;
}
