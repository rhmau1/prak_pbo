package jobsheet2.tugas;

public class Lingkaran {
    private double phi, r;

    Lingkaran(double phi, double r) {
        this.phi = phi;
        this.r = r;
    }

    public double hitungLuas() {
        return phi * r * r;
    }

    public double hitungKeliling() {
        return phi * (2 * r);
    }
}
