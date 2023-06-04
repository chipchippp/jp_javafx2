package java63;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<String>();
        danhSachSV.offer("titv 1");
        danhSachSV.offer("NvlA");
        danhSachSV.offer("NvlB");
        danhSachSV.offer("titv 2");

        while (true){
            String ten = danhSachSV.poll(); //lấy ra và xóa
            if (ten == null){
                break;
            }
            //peek => lấy ra nhưng k xóa
            System.out.println(ten);
        }

    }
}
