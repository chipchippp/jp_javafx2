package javafxdb;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HomeController extends FormController implements Initializable {

    public static ObservableList<Student> listStudents = FXCollections.observableArrayList();
    public ListView<Student> lv;
    public static Student editPro;


    private final static String connectionString = "jdbc:mysql://localhost:3306/t2210a_jp";
    private final static String user = "root";
    private final static String pwd = "";// xampp: ""  mamp: "root"

    public void goToForm(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // lv.setItems(listStudents);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectionString,user,pwd);

            // query
            Statement stt = conn.createStatement();
            String sql = "select * from students";
            ResultSet rs = stt.executeQuery(sql);
            ObservableList<Student> list = FXCollections.observableArrayList();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String tel = rs.getString("tel");
                Student s = new Student(name,email,tel);
                list.add(s);
            }
            lv.setItems(list);
            lv.refresh();
        }catch (Exception e){
            System.out.println("error:"+e.getMessage());
        }
    }

    public void editPro(MouseEvent mouseEvent) {
        editPro = lv.getSelectionModel().getSelectedItem();
        if (editPro == null){
            txtName.setText(editPro.getName());
            txtTel.setText(editPro.getTel());
            txtEmail.setText(editPro.getEmail());
        }


    }
}



