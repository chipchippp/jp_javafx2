package login;

public final class Login {
//    public static Connection mycon(){
//        Connection con = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login","root" ,"");
//
//        }catch (ClassNotFoundException | SQLException e){
//            System.out.println(e);
//        }
//        return con;
//    }

    private String email;
    private String pass;

    public Login(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return  email + '\'' + pass + '\'';
    }
}
