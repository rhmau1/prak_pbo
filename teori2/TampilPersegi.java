public class TampilPersegi {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi();
        persegi1.setSisi(5);
        persegi1.dataPersegi();
        System.out.println("Luas persegi: " + persegi1.luasPersegi());
        System.out.println("Keliling persegi: " + persegi1.kelilingPersegi());
    }
}
