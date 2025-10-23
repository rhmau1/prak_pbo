// File: Seller.java
public class Seller extends Player {
    public Seller(String name, int money, int energy) {
        super(name, money, energy);
    }

    public void receive(int amount) {
        super.receive(amount);
        System.out.println(name + " dari toko menerima " + amount);
    }
}
