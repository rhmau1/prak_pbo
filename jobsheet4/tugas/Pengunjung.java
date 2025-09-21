package tugas;

public class Pengunjung {
    private String nama;
    private int umur;

    Pengunjung(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String info() {
        String info = "";
        info += "Umur: " + umur + " \n";
        info += "Nama: " + nama + " \n";
        return info;
    }
}
