package jobsheet2.tugas;

public class TestPeminjaman {
    public static void main(String[] args) {
        Member member1 = new Member("M1", "fijri");
        Game game1 = new Game("G1", "Pou", 12000);

        Peminjaman peminjaman1 = new Peminjaman("P1", member1, game1, 3);
        peminjaman1.tampilkanDataPeminjaman();
    }
}
