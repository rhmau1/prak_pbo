package jobsheet2;

public class Barang {
    public String namaBrg, jenisBrg;
    public int stok;

    public void tampilBarang() {
        System.out.println("Nama barang : " + namaBrg);
        System.out.println("Jenis barang : " + jenisBrg);
        System.out.println("Stok barang : " + stok);
    }

    // method dengan argumen dan nilai balik return
    public int tambahStok(int brgMasuk) {
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
