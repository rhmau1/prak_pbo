package jobsheet9.percobaan2;

public class PascaSarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
    public PascaSarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,71");
    }

    @Override
    public void kuliahDiKampus() {
        System.out.println("Aku Mahasiswa Pasca Sarjana, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Aku telah menjuarai kompetisi internasional");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Aku telah menerbitkan artikel di jurnal internasional");
    }

}
