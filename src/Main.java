package WEEK2.IT2503;

public class Main {
    public static void main(String[] args) {

        // Step 1: Welcome message
        System.out.println("=== Clothing Store Management System ===\n");

        // Step 2: Create objects (5+)
        ClothingItem item1 = new ClothingItem(101, "Hoodie", "L", 18000.0, "Nike", 10);
        ClothingItem item2 = new ClothingItem(102, "Jeans", "M", 22000.0, "Levis", 5);
        ClothingItem item3 = new ClothingItem(); // Default constructor

        Customer customer1 = new Customer(5001, "Azamat Tanat", "+77011234567", "L", 80);
        Customer customer2 = new Customer(5002, "Aruzhan S.", "+77019876543", "M", 150);

        Order order1 = new Order(1001, customer1.getName(), 0.0, "Pending", 0);
        Order order2 = new Order(); // Default
        order2.setOrderId(1002);
        order2.setCustomerName(customer2.getName());

        // Step 3: Display initial state
        System.out.println("--- CLOTHING ITEMS ---");
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);

        System.out.println("\n--- ORDERS ---");
        System.out.println(order1);
        System.out.println(order2);

        System.out.println("\n--- CUSTOMERS ---");
        System.out.println(customer1);
        System.out.println(customer2);

        // Step 4: Test getters
        System.out.println("\n--- TESTING GETTERS ---");
        System.out.println("Item 1 name: " + item1.getName());
        System.out.println("Item 2 price: " + item2.getPrice() + " KZT");
        System.out.println("Order 1 status: " + order1.getStatus());
        System.out.println("Customer 1 points: " + customer1.getPoints());

        // Step 5: Test setters
        System.out.println("\n--- TESTING SETTERS ---");
        System.out.println("Updating item3.");
        item3.setItemId(103);
        item3.setName("T-Shirt");
        item3.setSize("S");
        item3.setPrice(7000.0);
        item3.setBrand("Zara");
        item3.setStockQuantity(20);
        System.out.println("Updated: " + item3);

        System.out.println("\nChanging order2 customer.");
        order2.setCustomerName("Peter Parker");
        System.out.println("Updated: " + order2);

        // Step 6: Test additional methods
        System.out.println("\n--- TESTING CLOTHINGITEM METHODS ---");
        System.out.println(item2.getName() + " is premium: " + item2.isPremium());
        System.out.println("Applying 15% discount to " + item2.getName());
        item2.applyDiscount(15);
        System.out.println("New price: " + item2.getPrice() + " KZT");

        System.out.println("\n--- TESTING CUSTOMER METHODS ---");
        System.out.println(customer1.getName() + " is VIP: " + customer1.isVIP());
        System.out.println("Adding 30 points to " + customer1.getName());
        customer1.addPoints(30);
        System.out.println(customer1.getName() + " points: " + customer1.getPoints());
        System.out.println(customer1.getName() + " is VIP: " + customer1.isVIP());

        System.out.println("\n--- TESTING ORDER METHODS ---");
        System.out.println("Order " + order1.getOrderId() + " pending: " + order1.isPending());
        System.out.println("Add 2x Hoodie to order1: " + order1.addItem(item1, 2));
        System.out.println("Add 1x Jeans to order1: " + order1.addItem(item2, 1));
        System.out.println("Order1 total: " + order1.getTotalAmount() + " KZT");
        order1.complete();
        System.out.println("Order " + order1.getOrderId() + " status: " + order1.getStatus());

        // Step 7: Final summary
        System.out.println("\n--- FINAL STATE ---");
        System.out.println("Clothing Items:");
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);

        System.out.println("\nOrders:");
        System.out.println(order1);
        System.out.println(order2);

        System.out.println("\nCustomers:");
        System.out.println(customer1);
        System.out.println(customer2);

        // Step 8: Completion message
        System.out.println("\n=== Program Complete ===");
    }
}
