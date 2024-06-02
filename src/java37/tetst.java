//
//        import java.util.HashMap;
//        import java.util.Map;
//        import java.util.Scanner;
//
//class Customer {
//    private String name;
//    private String email;
//    private String phone;
//
//    public Customer(String name, String email, String phone) {
//        this.name = name;
//        this.email = email;
//        this.phone = phone;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//}
//
//public class CustomerManagementSystem {
//    private static Map<String, Customer> customerMap = new HashMap<>();
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int choice;
//
//        do {
//            System.out.println("Menu:");
//            System.out.println("1. Add new customer");
//            System.out.println("2. Find by name");
//            System.out.println("3. Display all");
//            System.out.println("4. Exit");
//            System.out.print("Enter your choice: ");
//            choice = scanner.nextInt();
//            scanner.nextLine(); // Consume the newline character
//
//            switch (choice) {
//                case 1:
//                    addCustomer(scanner);
//                    break;
//                case 2:
//                    findCustomerByName(scanner);
//                    break;
//                case 3:
//                    displayAllCustomers();
//                    break;
//                case 4:
//                    System.out.println("Exiting the program.");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//        } while (choice != 4);
//    }
//
//    private static void addCustomer(Scanner scanner) {
//        System.out.print("Enter name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter email: ");
//        String email = scanner.nextLine();
//        System.out.print("Enter phone: ");
//        String phone = scanner.nextLine();
//
//        Customer customer = new Customer(name, email, phone);
//        customerMap.put(name, customer);
//
//        System.out.println("Customer added successfully.");
//    }
//
//    private static void findCustomerByName(Scanner scanner) {
//        System.out.print("Enter name to search: ");
//        String name = scanner.nextLine();
//
//        Customer customer = customerMap.get(name);
//        if (customer != null) {
//            System.out.println("Name: " + customer.getName());
//            System.out.println("Email: " + customer.getEmail());
//            System.out.println("Phone: " + customer.getPhone());
//        } else {
//            System.out.println("Not found.");
//        }
//    }
//
//    private static void displayAllCustomers() {
//        System.out.println("Customer List:");
//        for (Customer customer : customerMap.values()) {
//            System.out.println("Name: " + customer.getName());
//            System.out.println("Email: " + customer.getEmail());
//            System.out.println("Phone: " + customer.getPhone());
//            System.out.println();
//        }
//    }
//}
//
