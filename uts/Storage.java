
// File: Storage.java
import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<Harvest> stored; // daftar hasil panen

    public Storage() {
        stored = new ArrayList<Harvest>();
    }

    // Menyimpan hasil panen ke gudang
    public void store(Harvest h) {
        if (h == null)
            return;
        stored.add(h);
        System.out.println("Disimpan ke gudang: " + h);
    }

    // Menghapus hasil panen tertentu berdasarkan nama
    public boolean remove(String name) {
        for (int i = 0; i < stored.size(); i++) {
            if (stored.get(i).getNameSingle().equalsIgnoreCase(name)) {
                stored.remove(i);
                return true;
            }
        }
        return false;
    }

    // Menampilkan isi gudang
    public void showStorage() {
        System.out.println("==================================================");
        System.out.println("                  ISI GUDANG                     ");
        System.out.println("==================================================");
        if (stored.isEmpty()) {
            System.out.println("(Kosong)");
            return;
        }
        System.out.printf("%-5s %-15s %-10s %-10s\n", "No", "Nama", "Jumlah", "Total Nilai");
        int i = 1;
        for (Harvest h : stored) {
            System.out.printf("%-5d %-15s %-10d %-10d\n", i++, h.getNameSingle(), h.getQuantity(), h.getTotalPrice());
        }
    }

    // Mengambil semua hasil panen (untuk dijual ke toko)
    public List<Harvest> getAll() {
        return stored;
    }

    @Override
    public String toString() {
        if (stored.isEmpty())
            return "Gudang kosong";
        StringBuilder sb = new StringBuilder("Gudang berisi: ");
        for (Harvest h : stored) {
            sb.append(h.getNameSingle()).append("(").append(h.getQuantity()).append(") ");
        }
        return sb.toString();
    }
}
