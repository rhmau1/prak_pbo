import java.util.Random;

public abstract class Plant implements Item {
    protected String name;
    protected int timeToHarvest; // days required
    protected int waterNeededPerDay;
    protected int growth; // 0..100
    protected boolean sick;
    protected int daysGrown;
    protected int basePrice; // value when harvested
    protected Random rand = new Random();

    public Plant(String name, int timeToHarvest, int waterNeededPerDay, int basePrice) {
        this.name = name;
        this.timeToHarvest = timeToHarvest;
        this.waterNeededPerDay = waterNeededPerDay;
        this.basePrice = basePrice;
        this.growth = 0;
        this.sick = false;
        this.daysGrown = 0;
    }

    // Called each game day to advance growth (polymorphic)
    public abstract void grow(Weather weather);

    public void water() {
        // watering helps growth a bit
        growth += 5;
        if (growth > 100)
            growth = 100;
        System.out.println(name + " disiram. Growth: " + growth);
    }

    public void fertilize() {
        growth += 8;
        if (growth > 100)
            growth = 100;
        System.out.println(name + " dipupuk. Growth: " + growth);
    }

    public void attackedByPest() {
        sick = true;
        growth -= 15;
        if (growth < 0)
            growth = 0;
        System.out.println(name + " diserang hama! Growth turun menjadi " + growth);
    }

    public void treatPest() {
        if (sick) {
            sick = false;
            growth += 10;
            if (growth > 100)
                growth = 100;
            System.out.println(name + " berhasil diberantas hama. Growth: " + growth);
        } else {
            System.out.println(name + " tidak sakit.");
        }
    }

    // public boolean isReadyToHarvest() {
    // return daysGrown >= timeToHarvest || growth >= 90;
    // }
    public boolean isReadyToHarvest() {
        boolean ready = daysGrown >= timeToHarvest || growth >= 90;
        if (ready) {
            System.out.println(name + " siap dipanen!");
        } else {
            System.out.println(name + " belum siap dipanen.");
        }
        return ready;
    }

    public Harvest harvest() {
        if (!isReadyToHarvest()) {
            System.out.println(name + " belum siap panen.");
            return null;
        }
        int qty = 1 + rand.nextInt(3); // hasil acak 1-3
        int price = basePrice * qty;
        System.out.println("Panen " + qty + " x " + name + " (nilai: " + price + ")");
        // reset plant as harvested (could be removed from land)
        return new Harvest(name, qty, price);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return String.format("%s[growth=%d, daysGrown=%d, sick=%s]", name, growth, daysGrown, sick);
    }
}