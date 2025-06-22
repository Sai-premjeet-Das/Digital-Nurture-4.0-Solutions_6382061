import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> inventory = new HashMap<>();
    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Added: " + product);
    }
    public void updateProduct(int productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.quantity = quantity;
            product.price = price;
            System.out.println("Updated: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }
    public void deleteProduct(int productId) {
        Product removed = inventory.remove(productId);
        if (removed != null) {
            System.out.println("Deleted: " + removed);
        } else {
            System.out.println("Product not found.");
        }
    }
    public void displayInventory() {
        System.out.println("=== Current Inventory ===");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        Inventory manager = new Inventory();
        manager.addProduct(new Product(101, "Keyboard", 10, 999.99));
        manager.addProduct(new Product(102, "Mouse", 20, 499.49));
        manager.addProduct(new Product(103, "Monitor", 5, 6999.00));
        manager.updateProduct(101, 15, 899.99);
        manager.deleteProduct(102);
        manager.displayInventory();
    }
}
class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public String toString() {
        return "id: " + productId + ", name: " + productName +", qty: " + quantity + ", price: " + price;
    }
}