package OopsConceptProject.SmartVendingMachineSystem;

import java.time.LocalDate;
import java.util.Iterator;

public class MaintenanceStaff extends User implements MachineActions{
    private VendingMachine machine;

    public MaintenanceStaff(String name, int userId,VendingMachine machine) {
        super(name, userId);
        this.machine=machine;
    }

    @Override
    public void purchaseProduct(int productId) {
        System.out.println("Maintenance staff can't purchase items.");
    }

    @Override
    public void viewProducts() {
        machine.displayAllProducts();
    }

    public void restockProduct(int productId,int addedQty){
        Product product = machine.findProductById(productId);
        if (product != null) {
            product.setQuantity(product.getQuantity() + addedQty);
            System.out.println("Restocked " + product.getName() + " by " + addedQty);
        }
    }

    public void removedExpireItems(){
        LocalDate today = LocalDate.now(); //System current date

        Iterator<Product> iterator = machine.getProductList().iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            if (p.getExpiryDate().isBefore(today)) {
                System.out.println("Removing expired product: " + p.getName());
                iterator.remove();
            }
        }
    }

    public void viewDiagnostics(){

    }

    @Override
    public void showMenu() {
        System.out.println("Maintenance Mode Activated for: " + name);
    }
}
