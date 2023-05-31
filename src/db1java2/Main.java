package db1java2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i<5; i++){
//            NoTaxProduct p = new NoTaxProduct("nvl", 12);
//            p.input();
//            p.output();
//        }
        while (true){
            int choice =1;
            Scanner sc = new Scanner(System.in);
            ProductDAO dao = new ProductDAO();
            Product p;
            System.out.println("1. Insert product \n" +
                    "2. Update product \n" +
                    "3. Delete product \n" +
                    "4. Select All product");
            System.out.println("Choice ?: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    p = new Product("nvl", 12);
                    dao.insert(p);
                    p.input();
                    break;
                case 2:
                    p = new Product("nvl", 12);
                    p.input();
                    dao.update(p);
                    break;
                case 3:
                    sc = new Scanner(System.in);
                    System.out.println("name delete: ");
                    String nameDel = sc.nextLine();
                    dao.delete(nameDel);
                    break;
                case 4:
                    dao.select();
                    break;
            }
        }
    }
}
