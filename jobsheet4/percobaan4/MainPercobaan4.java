package percobaan4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("joko", "123");
        Gerbong gerbong = new Gerbong("a", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());

        Penumpang budi = new Penumpang("budi", "456");
        gerbong.setPenumpang(budi, 2);
        System.out.println(gerbong.info());
    }
}
