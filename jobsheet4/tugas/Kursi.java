package tugas;

public class Kursi {
    private String nomor;
    private Pengunjung pengunjung;

    Kursi(String nomor) {
        this.nomor = nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setPengunjung(Pengunjung pengunjung) {
        this.pengunjung = pengunjung;
    }

    public Pengunjung getPengunjung() {
        return pengunjung;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + " \n";
        if (this.pengunjung != null) {
            info += "pengunjung: \n" + pengunjung.info() + " \n";

        }
        return info;
    }
}
