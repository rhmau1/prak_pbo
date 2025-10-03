package jobsheet6;

public class MainTugas {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(3);
        Dosen dosen1 = new Dosen("123", "Fijriati", "Malang");
        dosen1.setSKS(12);

        Dosen dosen2 = new Dosen("456", "Rahmatur", "Bandung");
        dosen2.setSKS(10);

        Dosen dosen3 = new Dosen("789", "Rizqi", "Jakarta");
        dosen3.setSKS(8);

        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);
        daftar.addPegawai(dosen3);

        System.out.println("Print semua gaji pegawai: ");
        daftar.printSemuaGaji();
    }
}
