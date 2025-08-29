package jobsheet1.Tugas;

public class SeragamKatelpak extends Pakaian {
    public String jenisSeragam;

    public void setJenisSeragam(String jenisSeragam) {
        this.jenisSeragam = jenisSeragam;
    }

    public void dipakaiHari(String namaHari) {
        System.out.println("Seragam " + jenisSeragam + " dipakai pada hari " + namaHari);
    }
}
