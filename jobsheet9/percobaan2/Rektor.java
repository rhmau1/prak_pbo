package jobsheet9.percobaan2;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {
        System.out.println("saya REKTOR, beri sertifikat cumlaude");
        System.out.println("Selamat! silahkan perkenalkan diri anda..");
        mahasiswa.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        System.out.println("==================================");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa) {
        System.out.println("saya REKTOR, beri sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana anda bisa berprestasi?");
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        System.out.println("==================================");
    }
}
