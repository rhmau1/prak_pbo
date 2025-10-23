
// File: Shop.java
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private Seller owner;
    private List<Item> catalog; // barang yang dijual
    private List<Transaction> log;

    public Shop(String name, Seller owner) {
        this.name = name;
        this.owner = owner;
        catalog = new ArrayList<>();
        log = new ArrayList<>();
    }

    public void addToCatalog(Item item) {
        catalog.add(item);
    }

    // Overloaded buy: buyer can buy by Item object or by name
    public boolean buyFromShop(Buyer buyer, Item item) {
        if (!catalog.contains(item)) {
            System.out.println("Barang tidak ada di toko.");
            return false;
        }
        if (buyer.getMoney() < item.getPrice()) {
            System.out.println("Uang tidak cukup untuk membeli " + item.getName());
            return false;
        }
        buyer.pay(item.getPrice());
        owner.receive(item.getPrice());
        log.add(new Transaction(buyer.getName(), item.getName(), 1, item.getPrice()));
        buyer.addToInventory(item);
        System.out.println(buyer.getName() + " membeli " + item.getName() + " di " + name);
        return true;
    }

    public boolean buyFromShop(Buyer buyer, String itemName) {
        for (Item it : catalog) {
            if (it.getName().equalsIgnoreCase(itemName))
                return buyFromShop(buyer, it);
        }
        System.out.println("Barang " + itemName + " tidak ditemukan.");
        return false;
    }

    // Petani menjual hasil panen ke toko
    public boolean buyFromFarmer(Farmer farmer, Harvest h) {
        if (h == null)
            return false;
        int price = h.getTotalPrice();
        // shop buys at price (assume seller has infinite money in this simple sim)
        farmer.receive(price);
        log.add(new Transaction(farmer.getName(), h.getNameSingle(), h.getQuantity(), price));
        System.out.println(name + " membeli " + h + " dari " + farmer.getName());
        return true;
    }

    public void printLog() {
        System.out.println("=== Log Transaksi Toko " + name + " ===");
        for (Transaction t : log)
            System.out.println(t);
    }

    public String getName() {
        return name;
    }
}
