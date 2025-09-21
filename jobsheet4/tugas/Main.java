package tugas;

public class Main {
    public static void main(String[] args) {
        // Buat Film
        Film film1 = new Film("Avengers: Endgame", 13);
        Film film2 = new Film("Deadpool", 18);

        // Buat Studio
        Studio studio1 = new Studio("Studio 1", 5, film1);
        Studio studio2 = new Studio("Studio 2", 5, film2);

        // Buat Tiket
        Tiket tiketBiasa = new Tiket("T001", 50000);
        TiketPremium tiketPremium = new TiketPremium("TP01", 100000, "Snack + Kursi VIP");

        // Buat Pengunjung
        Pengunjung p1 = new Pengunjung("Rizqi", 15); // cukup umur untuk Avengers
        Pengunjung p2 = new Pengunjung("Budi", 16); // tidak cukup umur untuk Deadpool
        Pengunjung p3 = new Pengunjung("Sinta", 20); // bisa nonton Deadpool

        System.out.println("=== Daftar Studio ===");
        System.out.println(studio1.info());
        System.out.println(studio2.info());

        // Pemesanan 1: berhasil
        Pemesanan pesanan1 = new Pemesanan(p1, tiketBiasa, studio1.getKursi(2), studio1.getFilm());
        pesanan1.info();

        // Pemesanan 2: gagal karena usia tidak cukup
        Pemesanan pesanan2 = new Pemesanan(p2, tiketPremium, studio2.getKursi(3), studio2.getFilm());
        pesanan2.info();

        // Pemesanan 3: berhasil
        Pemesanan pesanan3 = new Pemesanan(p3, tiketPremium, studio2.getKursi(3), studio2.getFilm());
        pesanan3.info();

        // Pemesanan 4: gagal karena kursi sudah terisi
        Pemesanan pesanan4 = new Pemesanan(new Pengunjung("Andi", 25), tiketBiasa, studio1.getKursi(2),
                studio1.getFilm());
        pesanan4.info();

        System.out.println("\n=== Kondisi Kursi Studio 1 ===");
        System.out.println(studio1.info());

        System.out.println("\n=== Kondisi Kursi Studio 2 ===");
        System.out.println(studio2.info());
    }
}
