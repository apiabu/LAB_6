import java.util.*;
import java.util.stream.*;

class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class ProductFilterDemo {
    public static void main(String[] args) {
        // Setup: Create an ArrayList of Product objects
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.00));
        products.add(new Product("Mouse", 25.50));
        products.add(new Product("Keyboard", 45.00));
        products.add(new Product("Monitor", 150.00));
        products.add(new Product("USB Cable", 10.00));

        // User-defined price threshold
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minimum price to filter expensive products: ");
        double threshold = scanner.nextDouble();

        // Activity: Use stream, filter, and count
        long count = products.stream()
                             .filter(p -> p.getPrice() > threshold)
                             .count();

        System.out.println("Number of products more expensive than " + threshold + ": " + count);
    }
}


