package percobaan3;

public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("123", "sponsbob");
        Pegawai asisten = new Pegawai("345", "patrik");
        KeretaApi keretaApi = new KeretaApi("gaya baru", "bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
