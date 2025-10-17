package jobsheet9.percobaan2;

public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
    public Sarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }

    @Override
    public void kuliahDiKampus() {
        System.out.println("Aku Mahasiswa Sarjana, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Aku telah menjuarai kompetisi tingkat nasional");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Aku telah menerbitkan artikel di jurnal nasional");
    }

}
