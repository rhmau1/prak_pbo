package tugas;

public class TiketPremium extends Tiket {
    private String fasilitas;

    TiketPremium(String kode, int harga, String fasilitas) {
        super(kode, harga);
        this.fasilitas = fasilitas;
    }

    public void info() {
        super.info();
        System.out.println("Fasilitas: " + fasilitas);
    }
}
