package jobsheet1.Tugas;

public class Pakaian {
    private String bahan, warna;
    private char ukuran;

    Pakaian(String bahan, String warna, char ukuran) {
        this.bahan = bahan;
        this.warna = warna;
        this.ukuran = ukuran;
    }

    Pakaian() {
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setUkuran(char ukuran) {
        this.ukuran = ukuran;
    }

    public void cetakInformasi() {
        System.out.println("Bahan: " + bahan);
        System.out.println("Warna: " + warna);
        System.out.println("Ukuran: " + ukuran);
    }

    public void dicuci() {
        System.out.println("Pakaian dicuci");
    }

    public void dijemur() {
        System.out.println("Pakaian dijemur");
    }
}
