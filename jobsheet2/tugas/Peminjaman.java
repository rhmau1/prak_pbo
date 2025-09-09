package jobsheet2.tugas;

public class Peminjaman {
    private String idPeminjaman;
    private Member member;
    private Game game;
    private int lamaSewa;
    private double totalHarga;

    Peminjaman(String idPeminjaman, Member member, Game game, int lamaSewa) {
        this.idPeminjaman = idPeminjaman;
        this.member = member;
        this.game = game;
        this.lamaSewa = lamaSewa;
        hitungTotalHarga();
    }

    public void hitungTotalHarga() {
        this.totalHarga = lamaSewa * game.getHarga();
    }

    public void tampilkanDataPeminjaman() {
        System.out.println("ID Peminjaman: " + idPeminjaman);
        System.out.println("Nama member: " + member.getNamaMember());
        System.out.println("Nama game: " + game.getNamaGame());
        System.out.println("Total harga yang harus dibayar: " + totalHarga);
    }
}
