
// File: Transaction.java
import java.time.LocalDateTime;

public class Transaction {
    private String who; // seller/buyer/farmer
    private String item;
    private int quantity;
    private int totalPrice;
    private LocalDateTime time;

    public Transaction(String who, String item, int quantity, int totalPrice) {
        this.who = who;
        this.item = item;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.time = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "[" + time + "] " + who + " : " + item + " x" + quantity + " = " + totalPrice;
    }
}
