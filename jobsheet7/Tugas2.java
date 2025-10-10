package jobsheet7;

public class Tugas2 {
    public static void main(String[] args) {
        System.out.println("Class percobaan manusia, dosen, dan mahasiswa");
        Manusia m = new Manusia();
        m.bernafas();
        m.makan();
        Dosen d = new Dosen();
        d.bernafas();
        d.makan();
        d.lembur();
        Mahasiswa mh = new Mahasiswa();
        mh.bernafas();
        mh.makan();
        mh.tidur();

    }
}
