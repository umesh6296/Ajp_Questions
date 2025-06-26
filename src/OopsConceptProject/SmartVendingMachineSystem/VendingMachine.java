package OopsConceptProject.SmartVendingMachineSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private ArrayList<Product> productList;
    public VendingMachine() {
        productList = new ArrayList<>();
    }

    public void loadProducts() {
        productList.add(new Product(1, "Chips", 30, 10, "Snacks", LocalDate.parse("2025-12-31")));
        productList.add(new Product(2, "Coke", 40, 5, "Drink", LocalDate.parse("2025-10-10")));
        productList.add(new Product(3, "Protein Bar", 60, 7, "Health", LocalDate.parse("2025-08-15")));
    }
    public void displayAllProducts() {
        for (Product p : productList) {
            p.display();
        }
    }

    public Product findProductById(int id) {
        for (Product p : productList) {
            if (p.getProductId() == id) return p;
        }
        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }

}
