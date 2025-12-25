package WEEK2.IT2503;

public class Customer {
    private int customerId;
    private String name;
    private String phoneNumber;
    private String preferredSize;
    private int points;

    public Customer(int customerId, String name, String phoneNumber, String preferredSize, int points) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.preferredSize = preferredSize;
        this.points = points;
    }

    public Customer() {
        this.customerId = 0;
        this.name = "Unknown Customer";
        this.phoneNumber = "N/A";
        this.preferredSize = "M";
        this.points = 0;
    }

    // Getters
    public int getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getPreferredSize() { return preferredSize; }
    public int getPoints() { return points; }

    // Setters
    public void setCustomerId(int customerId) { this.customerId = customerId; }
    public void setName(String name) { this.name = name; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setPreferredSize(String preferredSize) { this.preferredSize = preferredSize; }
    public void setPoints(int points) { this.points = points; }

    // Additional methods (logic)
    public void addPoints(int points) {
        if (points > 0) this.points += points;
    }

    public boolean redeemPoints(int points) {
        if (points <= 0) return false;
        if (this.points >= points) {
            this.points -= points;
            return true;
        }
        return false;
    }

    public boolean isVIP() {
        return this.points >= 100;
    }

    public String getContactInfo() {
        return name + " (" + phoneNumber + ")";
    }

    @Override
    public String toString() {
        return "Customer{customerId=" + customerId +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", preferredSize='" + preferredSize + '\'' +
                ", points=" + points +
                '}';
    }
}
