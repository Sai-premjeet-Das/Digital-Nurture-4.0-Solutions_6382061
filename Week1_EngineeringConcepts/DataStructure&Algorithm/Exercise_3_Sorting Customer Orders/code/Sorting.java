public class Sorting {
    public static void printOrders(Order[] ord) {
        for (Order o : ord) {
            System.out.println(o);
        }
    }
    public static void bubbleSort(Order[] o) {
        int n = o.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (o[j].totalPrice > o[j + 1].totalPrice) {
                    Order temp = o[j];
                    o[j] = o[j + 1];
                    o[j + 1] = temp;
                }
            }
        }
    }
    public static void quickSort(Order[] o, int l, int h) {
        if (l < h) {
            int pi = partition(o, l, h);
            quickSort(o, l, pi - 1);
            quickSort(o, pi + 1, h);
        }
    }
    private static int partition(Order[] o, int l, int h) {
        double pivot = o[h].totalPrice;
        int i = l-1;
        for (int j = l; j < h; j++) {
            if (o[j].totalPrice < pivot) {
                i++;
                Order temp = o[i];
                o[i] = o[j];
                o[j] = temp;
            }
        }
        Order temp = o[i + 1];
        o[i + 1] = o[h];
        o[h] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Alice", 2999.99),
            new Order(102, "Bob", 499.00),
            new Order(103, "Charlie", 5499.50),
            new Order(104, "David", 1999.00),
            new Order(105, "Eva", 1499.75)
        };
        System.out.println("Original Orders:");
        printOrders(orders);
        bubbleSort(orders);
        System.out.println("\nSorted by Bubble Sort (Low to High):");
        printOrders(orders);
        orders = new Order[]{
            new Order(101, "Alice", 2999.99),
            new Order(102, "Bob", 499.00),
            new Order(103, "Charlie", 5499.50),
            new Order(104, "David", 1999.00),
            new Order(105, "Eva", 1499.75)
        };
        quickSort(orders, 0, orders.length - 1);
        System.out.println("\nSorted by Quick Sort (Low to High):");
        printOrders(orders);
    }
}
class Order {
    int orderId;
    String customerName;
    double totalPrice;
    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
    public String toString() {
        return "Order ID: " + orderId + ", Customer: " + customerName + ", Total: " + totalPrice;
    }
}