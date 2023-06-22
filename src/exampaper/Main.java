package exampaper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    private static Map<String, Customer> customerMap = new HashMap<>();
    public static void main(String[] args) {
        int select=0;


        do {

            System.out.println("Menu: ");
            System.out.println("1. Add new customer ");
            System.out.println("2. Find by name");
            System.out.println("3. Display all");
            System.out.println("4. Exit");
            select = sc.nextInt();
            sc.nextLine();
            if (select == 1) {
                addCustomer();
            } else if (select == 2){
                    findCustomerByName();
            } else if (select ==3){
                    displayAllCustomers();
            }






        }while (select!=4);
    }

    private static void addCustomer(){
        System.out.println("Import name: ");
        String name = sc.nextLine();
        System.out.println("Import email: ");
        String email = sc.nextLine();
        System.out.println("Import phone: ");
        String phone = sc.nextLine();
        Customer customer = new Customer(name, email, phone);

        if (customer != null){
            customerMap.put(name, customer);
            System.out.println();
        }
    }
    private static void findCustomerByName() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        Customer customer = customerMap.get(name);
        if (customer != null) {
            System.out.println("CRM");
            System.out.println("Name: " + customer.getName());
            System.out.println("Phone: " + customer.getPhone());
        } else {
            System.out.println("Not found.");
        }
    }

    private static void displayAllCustomers() {
        System.out.println("Customer List:");
        for (Customer customer : customerMap.values()) {
            System.out.println("Name: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Phone: " + customer.getPhone());
            System.out.println();
        }
    }

}
