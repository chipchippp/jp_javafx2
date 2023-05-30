package demo2;

import java.sql.*;

public class DemoDB {
    private final static String connectionString = "jdbc:mysql://localhost:3306/t2210a_jp";
    private final static String user = "root";
    private final static String pwd = "";// xampp: ""  mamp: "root"
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectionString,user,pwd);

            // query
            Statement stt = conn.createStatement();
            String sql = "select * from students";
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String tel = rs.getString("tel");
                System.out.println(id+"-"+name+"-"+email+"-"+tel);
            }
        }catch (Exception e){
            System.out.println("error:"+e.getMessage());
        }
    }
}
