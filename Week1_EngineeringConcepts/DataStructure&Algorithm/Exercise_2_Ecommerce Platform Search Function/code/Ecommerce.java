import java.util.*;


class Product {
    int productId;
    String productName;
    String category;
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    public String toString() {
        return "ID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}
public class Ecommerce {
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int currentId = products[mid].productId;
            if (currentId == targetId) {
                return products[mid];
            } else if (currentId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Backpack", "Bags"),
            new Product(105, "T-shirt", "Clothing")
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product ID to search:");
        int targetId = sc.nextInt();
        Product resultLinear = linearSearch(products, targetId);
        System.out.println("Linear Search Result: " + (resultLinear != null ? resultLinear : "Not found"));
        Product resultBinary = binarySearch(products, targetId);
        System.out.println("Binary Search Result: " + (resultBinary != null ? resultBinary : "Not found"));
        sc.close();
    }
}
