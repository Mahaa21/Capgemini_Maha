import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private List<Product> products;
    private Customer customer;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        double total = 0;
        for (Product p : products) {
            System.out.println(" - " + p.getName() + ": $" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total Amount: $" + total);
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void showOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Mouse", 25.0);
        Product p3 = new Product("Keyboard", 45.0);
        Product p4 = new Product("Monitor", 300.0);

        Order o1 = new Order(1, c1);
        o1.addProduct(p1);
        o1.addProduct(p2);

        Order o2 = new Order(2, c1);
        o2.addProduct(p3);

        Order o3 = new Order(3, c2);
        o3.addProduct(p4);

        c1.placeOrder(o1);
        c1.placeOrder(o2);
        c2.placeOrder(o3);

        c1.showOrders();
        c2.showOrders();
    }
}
