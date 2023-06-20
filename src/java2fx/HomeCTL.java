package java2fx;

import enums.RepositoryType;
import factory.RepositoryFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class HomeCTL implements Initializable {

    public static Student editStudent;
    public TableView<Student> tbV;
    public TableColumn<Student,Integer> tcId;
    public TableColumn<Student,String> tcName;
    public TableColumn<Student,String> tcEmail;
    public TableColumn<Student,String> tcTel;
    public TableColumn<Student,Button> tcAction;
    public Text lbPage;
    public Button btnCreate;
    public ComboBox<Locale> cbLang;


    public void goToForm(ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
       Main.mainStage.setScene(new Scene(root,600,400));
    }

    private void initMessages(){
        ResourceBundle rb = ResourceBundle.getBundle("resources.messages");
        lbPage.setText(rb.getString("student_list"));
        btnCreate.setText(rb.getString("create_student"));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // set list items for cbLang
        ObservableList<Locale> langs = FXCollections.observableArrayList();
        langs.add(new Locale("vi","VN"));
        langs.add(new Locale("en","VN"));
        cbLang.setItems(langs);
        cbLang.setValue(Locale.getDefault());

        initMessages();
        tcId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tcName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tcEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        tcTel.setCellValueFactory(new PropertyValueFactory<>("tel"));
        tcAction.setCellValueFactory(new PropertyValueFactory<>("edit"));
        try{
            ObservableList<Student> list = FXCollections.observableArrayList();
            list.addAll(RepositoryFactory.createRepositoryInstance(RepositoryType.STUDENT).getAll());
            tbV.setItems(list);
        }catch (Exception e){
            System.out.println("error:"+e.getMessage());
        }

    }

    public void chooseLang(ActionEvent actionEvent) throws Exception {
        Locale ch = cbLang.getValue();
        Locale.setDefault(ch);
        Parent root = FXMLLoader.load(getClass().getResource("homectl.fxml"));
        Main.mainStage.setScene(new Scene(root,600,400));
    }
}