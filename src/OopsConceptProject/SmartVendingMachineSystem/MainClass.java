package OopsConceptProject.SmartVendingMachineSystem;
import java.time.LocalDate;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.loadProducts();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Smart Vending Machine System!\n");

        System.out.println("Choose your role:");
        System.out.println("1. Customer");
        System.out.println("2. Maintenance Staff");
        int role = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (role == 1) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your wallet balance: ₹");
            double balance = scanner.nextDouble();

            Customer customer = new Customer(name, 101, balance, vm);

            int choice;
            do {
                System.out.println("\n--- CUSTOMER MENU ---");
                System.out.println("1. View Products");
                System.out.println("2. Purchase Product");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        customer.viewProducts();
                        break;
                    case 2:
                        System.out.print("Enter product ID to purchase: ");
                        int productId = scanner.nextInt();
                        customer.purchaseProduct(productId);
                        break;
                    case 3:
                        System.out.println("Thank you for visiting!");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 3);

        } else if (role == 2) {
            System.out.print("Enter your name (Maintenance Staff): ");
            String name = scanner.nextLine();

            MaintenanceStaff staff = new MaintenanceStaff(name, 201, vm);

            int choice;
            do {
                System.out.println("\n--- MAINTENANCE MENU ---");
                System.out.println("1. View Products");
                System.out.println("2. Restock Product");
                System.out.println("3. Remove Expired Items");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        staff.viewProducts();
                        break;
                    case 2:
                        System.out.print("Enter product ID to restock: ");
                        int productId = scanner.nextInt();
                        System.out.print("Enter quantity to add: ");
                        int qty = scanner.nextInt();
                        staff.restockProduct(productId, qty);
                        break;
                    case 3:
                        staff.removedExpireItems(); // now uses LocalDate internally
                        break;
                    case 4:
                        System.out.println("Exiting maintenance mode.");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } while (choice != 4);

        } else {
            System.out.println("Invalid role selected.");
        }

        scanner.close();
    }
}

