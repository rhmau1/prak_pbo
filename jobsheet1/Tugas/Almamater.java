package jobsheet1.Tugas;

public class Almamater extends Pakaian {
    private String logoKampus;

    public void setLogoKampus(String logoKampus) {
        this.logoKampus = logoKampus;
    }

    public void dipakaiAcara(String namaAcara) {
        System.out.println("Almamater dipakai acara " + namaAcara);
    }

    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Logo kampus: " + logoKampus);
    }
}
