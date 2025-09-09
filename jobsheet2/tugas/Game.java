package jobsheet2.tugas;

public class Game {
    private String idGame, namaGame;
    private double harga;

    Game(String idGame, String namaGame, double harga) {
        this.idGame = idGame;
        this.namaGame = namaGame;
        this.harga = harga;
    }

    public String getIdGame() {
        return idGame;
    }

    public String getNamaGame() {
        return namaGame;
    }

    public double getHarga() {
        return harga;
    }
}
