package jobsheet9.percobaan1;

public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;

    public Orang(String nama) {
        this.nama = nama;
    }

    public void peliharaHewan(Hewan hewan) {
        this.hewanPeliharaan = hewan;
    }

    public void ajakPeliharaanJalanJalan() {
        System.out.println("namaku: " + this.nama);
        System.out.println("peliharaanku bergerak dengan cara: ");
        this.hewanPeliharaan.bergerak();
        System.out.println("=============================");
    }
}
