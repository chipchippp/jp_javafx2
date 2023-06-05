package login;

import database.Connector;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.sql.Connection;

public class Form {
    public TextField txtEmail;
    public TextField txtPass;


    public void submit(ActionEvent actionEvent) {
        try {
            String email = txtEmail.getText();
            String pass = txtPass.getText();
            Login lg = new Login(email, pass);

            Connection conn = new Connector().getConn();


            String sql ="insert into students(name,email,tel) values(?,?,?)";

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }
}
