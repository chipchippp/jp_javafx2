package java2fx;

import javafx.scene.control.Button;

public final class Student {
    private  Integer id;
    private String name;
    private String email;
    private String tel;
    private Button edit;
    public Student(String name, String email, String tel) {
        this.name = name;
        this.email = email;
        this.tel = tel;
    }
    public Student(Integer id, String name, String email, String tel) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.edit = new Button("Edit");
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Button getEdit() {
        return edit;
    }
    public String toString(){
        return name+"-"+email;
    }
}
