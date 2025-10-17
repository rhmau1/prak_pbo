package jobsheet9.percobaan1;

public class Burung extends Hewan {
    // harus meng-override method bergerak() dari class Hewan, jika tidak dilakukan
    // maka error
    @Override
    public void bergerak() {
        System.out.println("Burung terbang dengan SAYAP");
    }
}
