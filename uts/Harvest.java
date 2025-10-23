// File: Harvest.java
public class Harvest implements Item {
    private String name;
    private int quantity;
    private int totalPrice;

    public Harvest(String name, int quantity, int totalPrice) {
        this.name = name;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public String getNameSingle() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return name + " x" + quantity + " (value=" + totalPrice + ")";
    }
}
