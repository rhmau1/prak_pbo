package jobsheet1.Tugas;

public class Laptop {
    public String warna, merk;
    public int storageRAM, harga;

    Laptop(String warna, String merk, int storageRAM, int harga) {
        this.warna = warna;
        this.merk = merk;
        this.storageRAM = storageRAM;
        this.harga = harga;
    }

    public void nyalakan() {
        System.out.println("Laptop " + merk + " nyala");
    }

    public void matikan() {
        System.out.println("Laptop " + merk + " mati");
    }

    public void mengisiDaya(int daya) {
        System.out.println("Laptop " + merk + " mengisi daya sebesar " + daya + " watt");
    }

    public void cetakInformasi() {
        System.out.println("Warna: " + warna);
        System.out.println("Merk: " + merk);
        System.out.println("Storage RAM: " + storageRAM + " GB");
        System.out.println("Harga: " + harga);
    }
}
