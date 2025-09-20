package percobaan3;

public class MainPertanyaan {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("123", "sponsbob");
        KeretaApi keretaApi = new KeretaApi("gaya baru", "bisnis", masinis);
        System.out.println(keretaApi.info());
    }
}
