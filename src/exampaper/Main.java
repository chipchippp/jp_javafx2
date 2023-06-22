package exampaper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Customer> customerMap = new HashMap<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int select=0;


        do {
            System.out.println("------------------------");
            System.out.println("Menu: ");
            System.out.println("1. Add new customer ");
            System.out.println("2. Find by name");
            System.out.println("3. Display all");
            System.out.println("4. Exit");
            select = sc.nextInt();
            sc.nextLine();
            if (select == 1){
                System.out.println("Import name: ");
                String name = sc.nextLine();
                System.out.println("Import email: ");
                String email = sc.nextLine();
                System.out.println("Import phone: ");
                String phone = sc.nextLine();
                Customer customer = new Customer(name, email, phone);

                if (select == 2){

                }
            }






        }while (select!=4);
    }
    private static void findCustomerByName(Scanner scanner) {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();

        Customer customer = customerMap.get(name);
        if (customer != null) {
            System.out.println("Name: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
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
