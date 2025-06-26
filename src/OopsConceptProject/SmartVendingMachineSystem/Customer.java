package OopsConceptProject.SmartVendingMachineSystem;

public class Customer extends User implements MachineActions{
    private double walletBalance;
    private VendingMachine machine;

    public Customer(String name, int userId, double walletBalance,VendingMachine machine) {
        super(name, userId);
        this.walletBalance = walletBalance;
        this.machine=machine;
    }

    @Override
    public void showMenu() {
        System.out.println("Welcome, " + name + "! Wallet: ₹" + walletBalance);
        viewProducts();
    }

    @Override
    public void purchaseProduct(int productId) {
        Product p = machine.findProductById(productId);
        if (p != null && p.getQuantity() > 0) {
            if (walletBalance >= p.getPrice()) {
                walletBalance -= p.getPrice();
                p.setQuantity(p.getQuantity() - 1);
                System.out.println("Purchase successful: " + p.getName());
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Product not available!");
        }
    }

    @Override
    public void viewProducts() {
        machine.displayAllProducts();
    }
}
