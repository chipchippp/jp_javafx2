package java2fx;

import database.Connector;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FormCTL {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtTel;

    public void submit(ActionEvent actionEvent) {
        try {
            String name = txtName.getText();
            String email = txtEmail.getText();
            String tel = txtTel.getText();
            Student sv = new Student(name, email,tel);


            Connection conn = new Connector().getConn();



            //query

            String sql = "insert into students(name,email,tel) values(?,?,?)";
            PreparedStatement stt = conn.prepareStatement(sql);
            stt.setString(1,sv.getName());
            stt.setString(2,sv.getEmail());
            stt.setString(3,sv.getTel());
            stt.executeUpdate();

            backToList(null);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }

    public void backToList(ActionEvent actionEvent) {
    }
}
