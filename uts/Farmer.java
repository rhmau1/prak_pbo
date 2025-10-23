
// File: Farmer.java
import java.util.ArrayList;
import java.util.List;

public class Farmer extends Player {
    private List<Land> lands;
    private Storage storage;

    public Farmer(String name, int money, int energy) {
        super(name, money, energy);
        this.lands = new ArrayList<>();
        this.storage = new Storage();
    }

    public void buyLand(double size, String soilType, int price) {
        if (money < price) {
            System.out.println(name + " tidak cukup uang untuk membeli lahan.");
            return;
        }
        int id = lands.size() + 1;
        Land l = new Land(id, size, soilType);
        lands.add(l);
        pay(price);
        System.out.println(name + " membeli lahan " + id);
    }

    public void plantSeed(int landId, Plant p) {
        Land l = getLandById(landId);
        if (l == null) {
            System.out.println("Lahan tidak ditemukan.");
            return;
        }
        l.plantSeed(p);
    }

    public void waterLand(int landId) {
        Land l = getLandById(landId);
        if (l == null)
            return;
        l.water();
    }

    public void fertilizeLand(int landId) {
        Land l = getLandById(landId);
        if (l == null)
            return;
        l.fertilize();
    }

    public void treatPests(int landId) {
        Land l = getLandById(landId);
        if (l == null)
            return;
        l.treatPests();
    }

    public void harvestToStorage(int landId) {
        Land l = getLandById(landId);
        if (l == null)
            return;
        Harvest h = l.harvest();
        if (h != null)
            storage.store(h);
    }

    public void sellHarvestToShop(Shop shop, int landId) {
        Land l = getLandById(landId);
        if (l == null)
            return;
        Harvest h = l.harvest();
        if (h != null)
            shop.buyFromFarmer(this, h);
    }

    public void simulateDay(Weather w) {
        for (Land l : lands) {
            l.simulateGrowth(w);
        }
    }

    private Land getLandById(int id) {
        for (Land l : lands)
            if (l.toString().startsWith("Lahan#" + id))
                return l;
        // simpler: search by id via toString used earlier — better to store id getter
        // in Land, but fine for this sim
        // We'll add a safer search:
        for (Land l : lands) {
            // reflection: but simpler—if l.toString contains "Lahan#id"
            if (l.toString().contains("Lahan#" + id + " "))
                return l;
        }
        return null;
    }

    public Storage getStorage() {
        return storage;
    }

    public List<Land> getLands() {
        return lands;
    }

    @Override
    public String toString() {
        return super.toString() + " lands=" + lands.size() + " storage=" + storage;
    }
}
