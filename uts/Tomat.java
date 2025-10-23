// File: Tomat.java
public class Tomat extends Plant {
    public Tomat() {
        super("Tomat", 4, 2, 30);
    }

    @Override
    public void grow(Weather weather) {
        daysGrown++;
        int gain = 5;
        if (weather.getHumidity() > 60)
            gain += 2;
        if (sick)
            gain -= 3;
        growth += gain;
        if (growth > 100)
            growth = 100;
        System.out.println("Tomat tumbuh +" + gain + " (kelembaban " + weather.getHumidity() + "%)");
    }
}
