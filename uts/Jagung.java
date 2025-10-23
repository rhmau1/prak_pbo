// File: Jagung.java
public class Jagung extends Plant {
    public Jagung() {
        super("Jagung", 6, 1, 25);
    }

    @Override
    public void grow(Weather weather) {
        daysGrown++;
        int gain = 5;
        if (weather.getCondition() == Weather.Condition.SUNNY)
            gain += 3;
        if (sick)
            gain -= 5;
        growth += gain;
        if (growth > 100)
            growth = 100;
        System.out.println("Jagung tumbuh +" + gain + " karena cuaca " + weather.getCondition());
    }
}
