package java38;

import java35.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(2, 5, 2025);
        Date date2 = new Date(1, 9, 2025);
        Date date3 = new Date(15, 10, 2025);

        Nation nation = new Nation("VN", "Việt Nam");
        Nation nation2 = new Nation("USA", "Hoa Kỳ");
        Nation nation3 = new Nation("TW", "Đài loan");


        Produce produce = new Produce("VNLapTop", nation);
        Produce produce2 = new Produce("Macbook", nation);
        Produce produce3 = new Produce("Asus", nation);

        Computer computer = new Computer(produce ,date, 5000, 12);
        Computer computer2 = new Computer(produce2 ,date2, 15000, 24);
        Computer computer3 = new Computer(produce3 ,date3, 25000, 36);

        System.out.println("So sanh gia thấp hơn: ");
        System.out.println("C and C2: "+computer.checkLowerPrice(computer2));
        System.out.println("C3 and C1: "+computer3.checkLowerPrice(computer));


        System.out.println("Tên sanr pham: ");
        System.out.println("C: "+computer.nameProduce());
        System.out.println("C2: "+computer2.nameProduce());
        System.out.println("C3: "+computer3.nameProduce());

    }
}
