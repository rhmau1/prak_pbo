
// File: Player.java
import java.util.ArrayList;
import java.util.List;

public abstract class Player {
    protected String name;
    protected int money;
    protected int energy;
    protected List<Item> inventory;

    public Player(String name, int money, int energy) {
        this.name = name;
        this.money = money;
        this.energy = energy;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int getEnergy() {
        return energy;
    }

    public void pay(int amount) {
        money -= amount;
    }

    public void receive(int amount) {
        money += amount;
    }

    public void addToInventory(Item item) {
        inventory.add(item);
    }

    public void showInventory() {
        System.out.println(name + " inventory: " + inventory);
    }

    @Override
    public String toString() {
        return name + " (money=" + money + ", energy=" + energy + ")";
    }
}
