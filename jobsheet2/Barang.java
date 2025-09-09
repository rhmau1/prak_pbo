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

    // fungsi argumen / parameter untuk mengirimkan nilai ke method, supaya nilai yg
    // diolah dalam fungsi tersebut bisa berubah sesuai dengan value yang diinput
    // tanpa perlu menulaskan berulang kali kodenya, sehingga kode bisa reuseable
    // dan fleksibel

    // kesimpulan kata kunci return digunakan untuk mengembalikan hasil dari method
    // ke pemanggilnya, kita menggunakan return untuk method yang menghasilkan nilai
    // yang nantinya kita gunakan lagi untuk bagian program yang lain
}
