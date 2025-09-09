package jobsheet2;

public class Mahasiswa {

    // proses deklarasi atribut
    public int nim;
    public String nama, alamat, kelas;

    // proses deklarasi method
    public void tampilBiodata() {
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Kelas : " + kelas);
    }
}
