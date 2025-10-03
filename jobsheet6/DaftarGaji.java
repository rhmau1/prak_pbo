package jobsheet6;

public class DaftarGaji {
    Pegawai[] listPegawai;

    DaftarGaji(int jumlah) {
        listPegawai = new Pegawai[jumlah];
    }

    public void addPegawai(Pegawai p) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                listPegawai[i] = p;
                break;
            }
        }
    }

    public void printSemuaGaji() {
        for (Pegawai p : listPegawai) {
            System.out.println("Nama : " + p.getNama());
            System.out.println("Gaji : " + p.getGaji());
            System.out.println("-------------------");
        }
    }
}
