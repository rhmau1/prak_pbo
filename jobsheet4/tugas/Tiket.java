package tugas;

public class Tiket {
    protected String kodeTiket;
    protected int hargaTiket;

    public Tiket(String kodeTiket, int hargaTiket) {
        this.kodeTiket = kodeTiket;
        this.hargaTiket = hargaTiket;
    }

    public int getHarga() {
        return hargaTiket;
    }

    public String getKode() {
        return kodeTiket;
    }

    public void info() {
        System.out.println("Kode tiket: " + getKode() + "\nHarga tiket: " + getHarga());
    }
}
