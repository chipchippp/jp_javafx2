package java63;

import java.util.LinkedList;
import  java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new PriorityQueue<String>();
        danhSachSV.offer("titv 1");
        danhSachSV.offer("NvlB");
        danhSachSV.offer("NvlA");
        danhSachSV.offer("titv 2");  // so sánh theo ưu tiên chữ cái đầu tiên

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
