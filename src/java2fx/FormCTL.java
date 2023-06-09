package java2fx;

import enums.RepositoryType;
import factory.RepositoryFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import login.Main;

public class FormCTL {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtTel;
    public void backToList(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("homectl.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }
    public void submit(ActionEvent actionEvent) {
        try {
            String name = txtName.getText();
            String email = txtEmail.getText();
            String tel = txtTel.getText();
            Student sv = new Student(name, email,tel);


            if (RepositoryFactory.createRepositoryInstance(RepositoryType.STUDENT).create(sv)){
                backToList(null);
            }else{
                throw new Exception("không thể tạo mới sinh viên");
            }

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }
}
