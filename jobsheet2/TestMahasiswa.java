package jobsheet2;

public class TestMahasiswa {
    public static void main(String[] args) {

        // instansiasi objek
        Mahasiswa mhs1 = new Mahasiswa();

        // memberikan nilai 101 ke atribut nim dari objek mhs1
        mhs1.nim = 101;
        mhs1.nama = "lestari";
        mhs1.alamat = "jl dinoyo";
        mhs1.kelas = "2C";

        // memanggil method tampilBiodata dari objek mhs1
        mhs1.tampilBiodata();

        // instansiasi 2 objek lagi
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
    }
}
