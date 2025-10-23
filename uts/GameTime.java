// File: GameTime.java
public class GameTime {
    private int day;
    private int month; // simple months 1..12

    public GameTime() {
        day = 1;
        month = 1;
    }

    public void advanceDay() {
        day++;
        if (day > 30) {
            day = 1;
            month++;
            if (month > 12)
                month = 1;
        }
    }

    public String getSeason() {
        // very simple mapping
        if (month >= 3 && month <= 5)
            return "Musim Semi";
        if (month >= 6 && month <= 8)
            return "Musim Panas";
        if (month >= 9 && month <= 11)
            return "Musim Gugur";
        return "Musim Dingin";
    }

    public String toString() {
        return "Hari " + day + " Bulan " + month + " (" + getSeason() + ")";
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
}
