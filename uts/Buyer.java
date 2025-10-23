// File: Buyer.java
public class Buyer extends Player {
    public Buyer(String name, int money, int energy) {
        super(name, money, energy);
    }

    public void buyFromShop(Shop shop, String itemName) {
        shop.buyFromShop(this, itemName);
    }
}
