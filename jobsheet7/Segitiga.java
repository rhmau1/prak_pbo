package jobsheet7;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
        return sisiA + sisiB + c;
    }

    public static void main(String[] args) {
        Segitiga segitiga1 = new Segitiga();
        System.out.println("Total sudut: " + segitiga1.totalSudut(60));
        System.out.println("Total sudut: " + segitiga1.totalSudut(60, 30));
        System.out.println("Keliling: " + segitiga1.keliling(3, 4, 5));
        System.out.println("Keliling: " + segitiga1.keliling(3, 4));
    }
}
