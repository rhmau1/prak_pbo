package jobsheet9.percobaan2;

public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Mahasiswa mahasiswaBiasa = new Mahasiswa("Udin");
        Sarjana sarjanaCumlaude = new Sarjana("Jono");
        PascaSarjana masterCumlaude = new PascaSarjana("Anin");

        // pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);

        // sarjanaCumlaude.kuliahDiKampus(); //bisa dipanggil dari class program
        // masterCumlaude.kuliahDiKampus();

        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}
