package jobsheet2.tugas;

public class Barang {
    private String kode, namaBarang;
    private int hargaDasar;
    private float diskon;

    public Barang(String kode, String namaBarang, int hargaDasar, float diskon) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    public int hitungHargaJual() {
        return (int) (hargaDasar - (diskon * hargaDasar));
    }

    public void tampilData() {
        System.out.println("Kode Barang   : " + kode);
        System.out.println("Nama Barang   : " + namaBarang);
        System.out.println("Harga Dasar   : Rp " + hargaDasar);
        System.out.println("Diskon        : " + (diskon * 100) + " %");
        System.out.println("Harga Jual    : Rp " + hitungHargaJual());
    }
}
