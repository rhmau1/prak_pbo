
// File: Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Setup objek utama
        Seller seller = new Seller("Budi (Penjual)", 1000, 100);
        Shop shop = new Shop("Toko Agro", seller);
        Farmer farmer = new Farmer("Andi (Petani)", 500, 100);
        Buyer buyer = new Buyer("Rina (Pembeli)", 300, 100);

        // Tambahkan bibit ke toko
        shop.addToCatalog(new Padi());
        shop.addToCatalog(new Jagung());
        shop.addToCatalog(new Tomat());

        GameTime time = new GameTime();
        Weather weather = new Weather();

        int pilihan;
        boolean running = true;

        while (running) {
            System.out.println("==================================================");
            System.out.printf("%-45s\n", "SIMULASI GAME PERTANIAN SEDERHANA");
            System.out.println("==================================================");
            System.out.println("Tanggal : " + time);
            weather.randomize();
            System.out.println("Cuaca   : " + weather);
            System.out.println("==================================================");
            System.out.printf("%-20s%-15s%-15s\n", "Nama Pemain", "Uang", "Energi");
            System.out.printf("%-20s%-15d%-15d\n", farmer.getName(), farmer.getMoney(), farmer.getEnergy());
            System.out.println("--------------------------------------------------");
            System.out.println("1. Beli Lahan");
            System.out.println("2. Beli Bibit");
            System.out.println("3. Tanam Bibit");
            System.out.println("4. Siram Tanaman");
            System.out.println("5. Pupuk Tanaman");
            System.out.println("6. Berantas Hama");
            System.out.println("7. Panen & Simpan ke Gudang");
            System.out.println("8. Jual Hasil Panen ke Toko");
            System.out.println("9. Lihat Gudang & Lahan");
            System.out.println("10. Lanjut ke Hari Berikutnya");
            System.out.println("0. Keluar");
            System.out.println("==================================================");
            System.out.print("Pilih aksi: ");
            pilihan = validInt(sc);

            switch (pilihan) {
                case 1 -> beliLahan(sc, farmer);
                case 2 -> beliBibit(sc, farmer, shop);
                case 3 -> tanamBibit(sc, farmer);
                case 4 -> siramTanaman(sc, farmer);
                case 5 -> pupukTanaman(sc, farmer);
                case 6 -> berantasHama(sc, farmer);
                case 7 -> panen(farmer);
                case 8 -> jualHasilPanen(farmer, shop);
                case 9 -> lihatStatus(farmer, shop);
                case 10 -> {
                    farmer.simulateDay(weather);
                    randomEventBuyer(buyer, shop);
                    time.advanceDay();
                    System.out.println("Hari berganti...");
                    pause(sc);
                }
                case 0 -> {
                    running = false;
                    System.out.println("Terima kasih telah bermain!");
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
        sc.close();
    }

    // ====================== METHOD BANTUAN =======================

    static void beliLahan(Scanner sc, Farmer farmer) {
        System.out.println("=== BELI LAHAN ===");
        System.out.print("Masukkan ukuran lahan (misal 10): ");
        double size = validDouble(sc);
        System.out.print("Masukkan jenis tanah: ");
        String soil = sc.next();
        System.out.print("Masukkan harga lahan: ");
        int price = validInt(sc);
        farmer.buyLand(size, soil, price);
        pause(sc);
    }

    static void beliBibit(Scanner sc, Farmer farmer, Shop shop) {
        System.out.println("=== BELI BIBIT ===");
        System.out.printf("%-5s %-15s %-10s\n", "No", "Nama", "Harga");
        int i = 1;
        for (Item item : List.of(new Padi(), new Jagung(), new Tomat())) {
            System.out.printf("%-5d %-15s %-10d\n", i++, item.getName(), item.getPrice());
        }
        System.out.print("Pilih bibit (1-3): ");
        int pilih = validInt(sc);
        Item bibit = switch (pilih) {
            case 1 -> new Padi();
            case 2 -> new Jagung();
            case 3 -> new Tomat();
            default -> null;
        };
        if (bibit == null) {
            System.out.println("Pilihan tidak valid.");
        } else if (farmer.getMoney() >= bibit.getPrice()) {
            farmer.pay(bibit.getPrice());
            farmer.addToInventory(bibit);
            System.out.println(farmer.getName() + " membeli bibit " + bibit.getName());
        } else {
            System.out.println("Uang tidak cukup.");
        }
        pause(sc);
    }

    static void tanamBibit(Scanner sc, Farmer farmer) {
        System.out.println("=== TANAM BIBIT ===");
        farmer.showInventory();
        System.out.print("Masukkan ID lahan tempat menanam (1 dst): ");
        int id = validInt(sc);
        System.out.print("Pilih nama bibit yang akan ditanam: ");
        String nama = sc.next();
        Plant tanaman = switch (nama.toLowerCase()) {
            case "padi" -> new Padi();
            case "jagung" -> new Jagung();
            case "tomat" -> new Tomat();
            default -> null;
        };
        if (tanaman == null) {
            System.out.println("Bibit tidak dikenal.");
        } else {
            farmer.plantSeed(id, tanaman);
        }
        pause(sc);
    }

    static void siramTanaman(Scanner sc, Farmer farmer) {
        System.out.println("=== SIRAM TANAMAN ===");
        System.out.print("Masukkan ID lahan: ");
        int id = validInt(sc);
        farmer.waterLand(id);
        pause(sc);
    }

    static void pupukTanaman(Scanner sc, Farmer farmer) {
        System.out.println("=== PUPUK TANAMAN ===");
        System.out.print("Masukkan ID lahan: ");
        int id = validInt(sc);
        farmer.fertilizeLand(id);
        pause(sc);
    }

    static void berantasHama(Scanner sc, Farmer farmer) {
        System.out.println("=== BERANTAS HAMA ===");
        System.out.print("Masukkan ID lahan: ");
        int id = validInt(sc);
        farmer.treatPests(id);
        pause(sc);
    }

    static void panen(Farmer farmer) {
        System.out.println("=== PANEN HASIL ===");
        for (Land l : farmer.getLands()) {
            System.out.println(l);
        }
        System.out.println("Pilih lahan yang ingin dipanen: ");
        Scanner sc = new Scanner(System.in);
        int id = validInt(sc);
        farmer.harvestToStorage(id);
        pause(sc);
    }

    static void jualHasilPanen(Farmer farmer, Shop shop) {
        System.out.println("=== JUAL HASIL PANEN ===");
        Storage s = farmer.getStorage();
        s.showStorage();
        List<Harvest> jual = new ArrayList<Harvest>(s.getAll());
        if (jual.isEmpty()) {
            System.out.println("Gudang kosong, tidak ada yang dijual.");
        } else {
            for (Harvest h : jual) {
                shop.buyFromFarmer(farmer, h);
                s.remove(h.getNameSingle()); // hapus hasil setelah dijual
            }
        }
        pause(new Scanner(System.in));
    }

    static void lihatStatus(Farmer farmer, Shop shop) {
        System.out.println("=== STATUS PETANI ===");
        System.out.println(farmer);
        System.out.println();
        System.out.println("=== DAFTAR LAHAN ===");
        for (Land l : farmer.getLands()) {
            System.out.println(l);
        }
        System.out.println();
        farmer.getStorage().showStorage();
        System.out.println();
        shop.printLog();
        pause(new Scanner(System.in));
    }

    static void randomEventBuyer(Buyer buyer, Shop shop) {
        if (Math.random() < 0.4) {
            System.out.println(buyer.getName() + " datang ke toko dan membeli bibit Tomat.");
            buyer.buyFromShop(shop, "Tomat");
        }
    }

    // ===================== Utility Display ======================

    static void pause(Scanner sc) {
        System.out.println("\nTekan ENTER untuk melanjutkan...");
        sc.nextLine();
    }

    static int validInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Masukkan angka yang valid: ");
            sc.next();
        }
        return sc.nextInt();
    }

    static double validDouble(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("Masukkan angka desimal yang valid: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}
