package demo5;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        Locale lc = new Locale("vi", "VN");
        Locale.setDefault(lc);
        ResourceBundle rb = ResourceBundle.getBundle("resources.messages");
        System.out.println(rb.getString("hello"));
//        System.out.println(rb.getString("age"));


    }
}
