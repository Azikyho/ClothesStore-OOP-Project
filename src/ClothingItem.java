package WEEK2.IT2503;

public class ClothingItem {
    private int itemId;
    private String name;
    private String size;   
    private double price; 
    private String brand;
    private int stockQuantity;

    public ClothingItem(int itemId, String name, String size, double price, String brand, int stockQuantity) {
        this.itemId = itemId;
        this.name = name;
        this.size = size;
        this.price = price;
        this.brand = brand;
        this.stockQuantity = stockQuantity;
    }

    public ClothingItem() {
        this.itemId = 0;
        this.name = "Unknown Item";
        this.size = "One Size";
        this.price = 0.0;
        this.brand = "No Brand";
        this.stockQuantity = 0;
    }


    public int getItemId() { return itemId; }
    public String getName() { return name; }
    public String getSize() { return size; }
    public double getPrice() { return price; }
    public String getBrand() { return brand; }
    public int getStockQuantity() { return stockQuantity; }

    public void setItemId(int itemId) { this.itemId = itemId; }
    public void setName(String name) { this.name = name; }
    public void setSize(String size) { this.size = size; }
    public void setPrice(double price) { this.price = price; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }

    public void applyDiscount(double percentage) {
        if (percentage <= 0 || percentage >= 100) return;
        this.price = this.price * (1 - percentage / 100.0);
    }

    public boolean isPremium() {
        return this.price >= 20000.0;
    }

    public boolean sell(int qty) {
        if (qty <= 0) return false;
        if (stockQuantity >= qty) {
            stockQuantity -= qty;
            return true;
        }
        return false;
    }

    public void restock(int qty) {
        if (qty > 0) stockQuantity += qty;
    }

    @Override
    public String toString() {
        return "ClothingItem{itemId=" + itemId +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", stockQuantity=" + stockQuantity +
                '}';
    }
}
