package jobsheet1.Tugas;

public class Demo {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Hitam", "Lenovo", 8, 5000000);
        Botol botol1 = new Botol("Hitam", "Plastik", 5);

        laptop1.nyalakan();
        laptop1.mengisiDaya(20);
        laptop1.matikan();
        laptop1.cetakInformasi();

        System.out.println("\n");
        botol1.mengisiAir(1.5);
        botol1.minum(1.2);
        botol1.cekSisaAir();
        botol1.cetakInformasi();

        System.out.println("\n");
        Pakaian pakaian1 = new Pakaian("Kain", "Hitam", 'M');
        pakaian1.dicuci();
        pakaian1.dijemur();
        pakaian1.cetakInformasi();

        System.out.println("\n");
        Almamater almamater1 = new Almamater();
        almamater1.setBahan("kain");
        almamater1.setWarna("biru");
        almamater1.setUkuran('L');
        almamater1.setLogoKampus("Polinema");
        almamater1.dipakaiAcara("Pameran");
        almamater1.cetakInformasi();

        System.out.println("\n");
        SeragamKatelpak katelpak1 = new SeragamKatelpak();
        katelpak1.setBahan("kain");
        katelpak1.setWarna("biru");
        katelpak1.setUkuran('L');
        katelpak1.setJenisSeragam("Katelpak");
        katelpak1.dipakaiHari("Senin, Selasa, Jumat");
        katelpak1.cetakInformasi();
    }
}
