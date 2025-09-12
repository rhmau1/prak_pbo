package jobsheet3.motorencacpsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    // public int kecepatan = 0;
    // public boolean kontakOn = false;

    // percobaan 2
    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan >= 100) {
                System.out.println("kecepatan sudah maksimal");
            } else {
                kecepatan += 5;
            }
        } else {
            System.out.println("kecepatan tidak bisa bertambah karena mesin off");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            if (kecepatan <= 0) {
                System.out.println("kecepatan sudah 0");
            } else {
                kecepatan -= 5;
            }
        } else {
            System.out.println("kecepatan tidak bisa berkurang karen mesin off");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
