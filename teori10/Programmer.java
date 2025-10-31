package teori10;

public class Programmer extends Pegawai {
    int bonus;

    Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    @Override
    public int getGaji() {
        return super.getGaji();
    }

    public int getBonus() {
        return bonus;
    }
}
