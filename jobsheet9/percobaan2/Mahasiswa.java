package jobsheet9.percobaan2;

public class Mahasiswa {
    protected String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public void kuliahDiKampus() {
        System.out.println("Aku Mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus");
    }
}
