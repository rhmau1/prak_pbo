public class Persegi {
    private int sisi;

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public void dataPersegi() {
        System.out.println("Panjang sisi persegi: " + sisi);
    }

    public int luasPersegi() {
        int luas = sisi * sisi;
        return luas;
    }

    public int kelilingPersegi() {
        int keliling = 4 * sisi;
        return keliling;
    }
}
