package percobaan4;

public class Penumpang {
    private String ktp, nama;

    Penumpang(String nama, String ktp) {
        this.nama = nama;
        this.ktp = ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String info() {
        String info = "";
        info += "Ktp: " + ktp + " \n";
        info += "Nama: " + nama + " \n";
        return info;
    }
}
