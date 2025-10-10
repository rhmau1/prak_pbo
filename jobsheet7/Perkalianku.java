package jobsheet7;

public class Perkalianku {
    public void perkalian(int a, int b) {
        System.out.println(a * b);
    }

    void perkalian(int a, int b, int c) {
        System.out.println(a * b * c);
    }

    void perkalian(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Perkalianku object = new Perkalianku();
        System.out.print("Hasil perkalian 25 x 43: ");
        object.perkalian(25, 43);
        System.out.print("Hasil perkalian 34 x 23 x 56: ");
        object.perkalian(34, 23, 56);
        System.out.print("Hasil perkalian 34.56 x 23.7: ");
        object.perkalian(34.56, 23.7);
    }
}
