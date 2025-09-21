package percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        // this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        Kursi kursi = this.arrayKursi[nomor - 1]; // ambil kursi sesuai nomor

        if (kursi.getPenumpang() == null) {
            kursi.setPenumpang(penumpang);
            System.out.println("Penumpang berhasil duduk di kursi nomor " + nomor);
        } else {
            System.out.println("Kursi nomor " + nomor + " sudah ditempati oleh "
                    + kursi.getPenumpang().getNama());
        }
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + " \n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
