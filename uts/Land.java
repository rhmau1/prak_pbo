public class Land {
    private int id;
    private double size; // ukuran
    private String soilType;
    private Plant plant; // komposisi: lahan punya tanaman
    private boolean hasPests;

    public Land(int id, double size, String soilType) {
        this.id = id;
        this.size = size;
        this.soilType = soilType;
        this.plant = null;
        this.hasPests = false;
    }

    public boolean isEmpty() {
        return plant == null;
    }

    public boolean plantSeed(Plant p) {
        if (!isEmpty()) {
            System.out.println("Lahan sudah terisi!");
            return false;
        }
        this.plant = p;
        System.out.println("Menanam " + p.getName() + " di lahan " + id);
        return true;
    }

    public Plant getPlant() {
        return plant;
    }

    public void water() {
        if (plant != null)
            plant.water();
        else
            System.out.println("Tidak ada tanaman di lahan " + id);
    }

    public void fertilize() {
        if (plant != null)
            plant.fertilize();
        else
            System.out.println("Tidak ada tanaman di lahan " + id);
    }

    public void simulateGrowth(Weather w) {
        if (plant != null) {
            // kemungkinan hama muncul
            if (!hasPests && Math.random() < 0.08) { // 8% daily chance
                hasPests = true;
                plant.attackedByPest();
            }
            plant.grow(w);
        }
    }

    public Harvest harvest() {
        if (plant == null) {
            System.out.println("Tidak ada yang dipanen di lahan " + id);
            return null;
        }
        Harvest h = plant.harvest();
        if (h != null) {
            plant = null; // kosongkan lahan setelah panen
            hasPests = false;
        }
        return h;
    }

    public void treatPests() {
        if (plant != null && hasPests) {
            plant.treatPest();
            hasPests = false;
        } else {
            System.out.println("Tidak ada hama di lahan " + id);
        }
    }

    @Override
    public String toString() {
        return "Lahan#" + id + " [" + soilType + ", size=" + size + ", plant=" + (plant == null ? "kosong" : plant)
                + "]";
    }
}