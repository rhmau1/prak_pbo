package tugas;

public class Pemesanan {
    private Pengunjung pengunjung;
    private Tiket tiket;
    private Kursi kursi;
    private Film film;
    private boolean berhasil = false;

    Pemesanan(Pengunjung pengunjung, Tiket tiket, Kursi kursi, Film film) {
        if (pengunjung.getUmur() < film.getMinUsiaPenonton()) {
            System.out.println("Penonton minimal usia " + film.getMinUsiaPenonton() + " tahun untuk film \""
                    + film.getJudul() + "\"");
            return; // hentikan pemesanan
        }
        if (kursi.getPengunjung() != null) {
            System.out.println("Kursi " + kursi.getNomor() + " sudah terisi");
            return; // hentikan pemesanan
        }
        this.pengunjung = pengunjung;
        this.tiket = tiket;
        this.kursi = kursi;
        this.film = film;
        kursi.setPengunjung(pengunjung);
        berhasil = true;
        System.out.println("Pemesanan berhasil untuk " + pengunjung.getNama());
    }

    public void info() {
        if (!berhasil) {
            System.out.println("Pemesanan gagal, tidak ada info tiket. \n");
            return;
        }
        System.out.println("=== Info Pemesanan ===");
        tiket.info();
        System.out.println("Nama penonton: " + pengunjung.getNama() +
                "\nUsia penonton: " + pengunjung.getUmur());
        System.out.println("Nomor kursi: " + kursi.getNomor());
        System.out.println("Judul film: " + film.getJudul() + "\n");
    }
}
