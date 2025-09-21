package tugas;

public class Studio {
    private String kode;
    private Kursi[] arrayKursi;
    private Film film;

    Studio(String kode, int jumlah, Film film) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
        this.film = film;
    }

    public Kursi getKursi(int nomor) {
        return arrayKursi[nomor - 1];
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

    public Film getFilm() {
        return film;
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + " \n";
        info += "film: " + film.getJudul() + " \n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
