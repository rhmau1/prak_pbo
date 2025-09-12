package jobsheet3;

public class Anggota {
    private String nomorKTP, nama;
    private float jumlahPinjaman;
    private float limitPinjaman;

    Anggota(String nomorKTP, String nama, float jumlahPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.jumlahPinjaman = jumlahPinjaman;
        this.limitPinjaman = 5000000; // buat default limit menjadi 5jt
    }

    public String getNama() {
        return nama;
    }

    public float getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public float getLimitPinjaman() {
        return limitPinjaman;
    }

    public void pinjam(float uang) {
        if ((uang + jumlahPinjaman) > limitPinjaman) {
            System.out.println("Pinjaman melebihi limit");
            return;
        } else {
            jumlahPinjaman += uang;
        }
    }

    public void angsur(float uang) {
        float minimalAngsur = jumlahPinjaman * 0.1f;
        if (uang < minimalAngsur) {
            System.out.println("Maaf angsuran minimal harus 10% dari jumlah pinjaman");
        } else if (uang > jumlahPinjaman) {
            System.out.println("Maaf angsuran melebihi jumlah pinjaman");
        } else {
            jumlahPinjaman -= uang;
        }
    }
}
