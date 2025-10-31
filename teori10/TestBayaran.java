package teori10;

public class TestBayaran {
    public static void main(String[] args) {
        Manajer man = new Manajer("fijri", 800, 50);
        Programmer prog = new Programmer("rahma", 600, 30);
        Bayaran hr = new Bayaran();
        System.out.println("bayaran manajer: " + hr.hitungBayaran(man));
        System.out.println("bayaran programmer: " + hr.hitungBayaran(prog));
    }
}
