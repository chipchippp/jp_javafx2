package db1java2;

import java.util.Scanner;

public class Product {
    private String name;
    private int price;


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImportTax(){
        return (int) (0.1 * getPrice());
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        setName(sc.next());
        System.out.println("Input price: ");
        setPrice(sc.nextInt());
    }

    public void output(){
        System.out.println("=> Name: " + getName()+ " - Price:"+getPrice() +" Tax: " +getImportTax());
    }
}
