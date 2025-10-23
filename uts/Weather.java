
// File: Weather.java
import java.util.Random;

public class Weather {
    public enum Condition {
        SUNNY, RAINY, CLOUDY
    }

    private Condition condition;
    private int temperature; // celcius
    private int humidity; // 0-100
    private Random rand = new Random();

    public Weather() {
        randomize();
    }

    public void randomize() {
        int r = rand.nextInt(3);
        condition = Condition.values()[r];
        switch (condition) {
            case SUNNY:
                temperature = 28 + rand.nextInt(8);
                humidity = 30 + rand.nextInt(20);
                break;
            case RAINY:
                temperature = 20 + rand.nextInt(6);
                humidity = 70 + rand.nextInt(20);
                break;
            default:
                temperature = 22 + rand.nextInt(6);
                humidity = 50 + rand.nextInt(15);
        }
    }

    public Condition getCondition() {
        return condition;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    @Override
    public String toString() {
        return condition + " temp=" + temperature + "C hum=" + humidity + "%";
    }
}
