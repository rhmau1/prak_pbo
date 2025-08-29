public class Sepeda {
    private String merk;
    private int kecepatan;
    private int gear;

    public void setMerek(String newValue) {
        merk = newValue;
    }

    public void gantiGear(int newValue) {
        gear = newValue;
    }

    public void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;
    }

    public void rem(int decrement) {
        kecepatan = kecepatan - decrement;
    }

    public void cetakStatus() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
    }
}
