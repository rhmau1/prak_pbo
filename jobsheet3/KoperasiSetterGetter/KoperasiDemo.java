package jobsheet3.KoperasiSetterGetter;

public class KoperasiDemo {
    public static void main(String[] args) {

        // percobaan 4
        Anggota anggota1 = new Anggota("fijri", "dinoyo");
        System.out.println("simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        // Anggota anggota1 = new Anggota();
        anggota1.setNama("Fijri");
        anggota1.setAlamat("Jalan MT Haryono");
        anggota1.setor(100000);
        System.out.println("simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}
