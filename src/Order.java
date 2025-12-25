package WEEK2.IT2503;

public class Order {
    private int orderId;
    private String customerName;
    private double totalAmount;
    private String status;     // Pending, Completed, Cancelled
    private int itemsCount;

    public Order(int orderId, String customerName, double totalAmount, String status, int itemsCount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
        this.itemsCount = itemsCount;
    }

    public Order() {
        this.orderId = 0;
        this.customerName = "Unknown";
        this.totalAmount = 0.0;
        this.status = "Pending";
        this.itemsCount = 0;
    }

    // Getters
    public int getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public double getTotalAmount() { return totalAmount; }
    public String getStatus() { return status; }
    public int getItemsCount() { return itemsCount; }

    // Setters
    public void setOrderId(int orderId) { this.orderId = orderId; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
    public void setStatus(String status) { this.status = status; }
    public void setItemsCount(int itemsCount) { this.itemsCount = itemsCount; }

    // Additional methods (logic)
    public boolean isPending() {
        return "Pending".equalsIgnoreCase(status);
    }

    public void complete() {
        if (!"Cancelled".equalsIgnoreCase(status)) status = "Completed";
    }

    public void cancel() {
        status = "Cancelled";
    }

    public void addAmount(double amount) {
        if (amount > 0 && isPending()) totalAmount += amount;
    }

    public boolean addItem(ClothingItem item, int qty) {
        if (!isPending()) return false;
        if (item == null || qty <= 0) return false;

        if (item.sell(qty)) {
            totalAmount += item.getPrice() * qty;
            itemsCount += qty;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Order{orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                ", itemsCount=" + itemsCount +
                '}';
    }
}
