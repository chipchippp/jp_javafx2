package daopattern;

import database.Connector;
import java2fx.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentRepository implements IRepository<Student> {
    private static StudentRepository instance;

    private StudentRepository() {}

    public static StudentRepository getInstance() {
        if (instance == null) {
            instance = new StudentRepository();
        }
        return instance;
    }

    @Override
    public ArrayList<Student> getAll() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            Connection conn = Connector.getInstance().getConn();
            Statement stt = conn.createStatement();
            String sql = "select * from students";
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String tel = rs.getString("tel");
                Student s = new Student(id, name, email, tel);
                students.add(s);
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        return students;
    }

    @Override
    public Boolean create(Student s) {
        try {
            Connection conn = Connector.getInstance().getConn();
            String sql = "insert into students(name,email,tel) values(?,?,?)";
            PreparedStatement stt = conn.prepareStatement(sql);
            stt.setString(1, s.getName());
            stt.setString(2, s.getEmail());
            stt.setString(3, s.getTel());
            stt.executeUpdate();
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        return false;
    }

    @Override
    public Boolean update(Student s) {
        try {
            Connection conn = Connector.getInstance().getConn();
            String sql = "update students set name=?, email=?, tel=? where id=?";
            PreparedStatement stt = conn.prepareStatement(sql);
            stt.setString(1, s.getName());
            stt.setString(2, s.getEmail());
            stt.setString(3, s.getTel());
            stt.executeUpdate();
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
        return false;
    }

    @Override
    public Boolean delete(Student s) {
        try {
            Connection conn = Connector.getInstance().getConn();
            String sql = "delete from students where id=?";
            PreparedStatement stt = conn.prepareStatement(sql);
            stt.setInt(1, s.getId());
            stt.executeUpdate();
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public Student find(Integer id) throws Exception {
        try{
            Connection conn = Connector.getInstance().getConn();
            String sql = "select * from students where id=?";
            PreparedStatement stt = conn.prepareStatement(sql);
            stt.setInt(1,id);
            ResultSet rs = stt.executeQuery();
            while (rs.next()){
                int sv_id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String tel = rs.getString("tel");
                Student s = new Student(sv_id,name,email,tel);
                return s;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }


}




