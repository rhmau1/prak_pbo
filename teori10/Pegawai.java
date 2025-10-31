package teori10;

public class Pegawai {
    String nama;
    int gaji;

    Pegawai() {
    };

    Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }
}
