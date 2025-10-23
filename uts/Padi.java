// File: Padi.java
public class Padi extends Plant {
    public Padi() {
        super("Padi", 5, 2, 20);
    }

    @Override
    public void grow(Weather weather) {
        daysGrown++;
        // Padi tumbuh lebih baik saat hujan
        int gain = 6;
        if (weather.getCondition() == Weather.Condition.RAINY)
            gain += 4;
        if (sick)
            gain -= 4;
        growth += gain;
        if (growth > 100)
            growth = 100;
        System.out.println("Padi tumbuh +" + gain + " karena cuaca " + weather.getCondition());
    }
}
