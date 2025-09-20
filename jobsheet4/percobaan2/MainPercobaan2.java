package percobaan2;

public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setMerk("avanza");
        m.setBiaya(350000);

        Sopir s = new Sopir();
        s.setNama("john doe");
        s.setBiaya(200000);

        Pelanggan p = new Pelanggan();
        p.setNama("jane doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya total = " + p.hitungBiayaTotal());

        System.out.println(p.getMobil().getMerk());
    }
}
