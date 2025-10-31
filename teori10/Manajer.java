package teori10;

public class Manajer extends Pegawai {
    int tunjangan;

    Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public int getGaji() {
        return super.getGaji();
    }

    public int getTunjangan() {
        return tunjangan;
    }

}
