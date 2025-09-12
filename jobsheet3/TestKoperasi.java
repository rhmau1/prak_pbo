package jobsheet3;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        // Anggota fijri = new Anggota("1234", "fijri", 1500000);
        // System.out.println("Nama anggota: " + fijri.getNama());
        // System.out.println("Limit pinjaman: " + fijri.getLimitPinjaman());

        // System.out.println("\nMeminjam uang 10.000.000");
        // fijri.pinjam(10000000);
        // System.out.println("Jumlah pinjaman saat ini: " + fijri.getJumlahPinjaman());

        // System.out.println("\nMeminjam uang 3.000.000");
        // fijri.pinjam(3000000);
        // System.out.println("Jumlah pinjaman saat ini: " + fijri.getJumlahPinjaman());

        // System.out.println("\nMembayar angsuran 1.000.000");
        // fijri.angsur(1000000);
        // System.out.println("Jumlah pinjaman saat ini: " + fijri.getJumlahPinjaman());

        // System.out.println("\nMembayar angsuran 2.000");
        // fijri.angsur(2000);
        // System.out.println("Jumlah pinjaman saat ini: " + fijri.getJumlahPinjaman());

        // System.out.println("\nMembayar angsuran 10.000.000");
        // fijri.angsur(10000000);
        // System.out.println("Jumlah pinjaman saat ini: " + fijri.getJumlahPinjaman());

        // System.out.println("\nMembayar angsuran 3.500.000");
        // fijri.angsur(3500000);
        // System.out.println("Jumlah pinjaman saat ini: " + fijri.getJumlahPinjaman());

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pinjaman anda: ");
        float pinjamanAwal = sc.nextFloat();
        Anggota fijri = new Anggota("1234", "fijri", pinjamanAwal);
        System.out.println("Nama anggota: " + fijri.getNama());
        System.out.println("Limit pinjaman: " + fijri.getLimitPinjaman());

        System.out.print("\nMasukkan jumlah angsuran anda: ");
        float angsuran = sc.nextFloat();
        System.out.println("\nMembayar angsuran " + angsuran);
        fijri.pinjam(angsuran);
        System.out.println("Jumlah pinjaman saat ini: " + fijri.getJumlahPinjaman());

        sc.close();
    }
}
