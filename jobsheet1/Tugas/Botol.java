package jobsheet1.Tugas;

public class Botol {
    public String warna, bahanBotol;
    public double kapasitas;

    Botol(String warna, String bahanBotol, double kapasitas) {
        this.warna = warna;
        this.bahanBotol = bahanBotol;
        this.kapasitas = kapasitas;
    }

    public void mengisiAir(double jumlah) {
        System.out.println("Mengisi air sebesar " + jumlah + " liter");
    }

    public void minum(double jumlah) {
        kapasitas -= jumlah;
        System.out.println("Air diminum sebanyak " + jumlah + " liter");
    }

    public void cekSisaAir() {
        System.out.println("Sisa air sebesar " + kapasitas + " liter");
    }

    public void cetakInformasi() {
        System.out.println("Warna: " + warna);
        System.out.println("Bahan botol: " + bahanBotol);
        System.out.println("Kapasitas: " + kapasitas + " liter");
    }
}
