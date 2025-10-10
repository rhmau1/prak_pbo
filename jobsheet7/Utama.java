package jobsheet7;

public class Utama {
    public static void main(String[] args) {
        System.out.println("Program testing class Manager & Staff");
        Manager m[] = new Manager[2];
        Staff staff1[] = new Staff[2];
        Staff staff2[] = new Staff[3];

        m[0] = new Manager();
        m[0].setNama("Ujang Suryaman");
        m[0].setNip("10101010");
        m[0].setGolongan("1");
        m[0].setTunjangan(5000000);
        m[0].setBagian("Administrasi");

        m[1] = new Manager();
        m[1].setNama("Dudung Abdurrachman");
        m[1].setNip("10101011");
        m[1].setGolongan("1");
        m[1].setTunjangan(2500000);
        m[1].setBagian("Pemasaran");

        staff1[0] = new Staff();
        staff1[0].setNama("Sukirman");
        staff1[0].setNip("20101010");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10000);

        staff1[1] = new Staff();
        staff1[1].setNama("Oom Somantri");
        staff1[1].setNip("20101011");
        staff1[1].setGolongan("2");
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(55000);
        m[0].setStaff(staff1);

        staff2[0] = new Staff();
        staff2[0].setNama("Ucup Suryaman");
        staff2[0].setNip("20101012");
        staff2[0].setGolongan("3");
        staff2[0].setLembur(15);
        staff2[0].setGajiLembur(5500);

        staff2[1] = new Staff();
        staff2[1].setNama("Otong Siregar");
        staff2[1].setNip("20101013");
        staff2[1].setGolongan("4");
        staff2[1].setLembur(5);
        staff2[1].setGajiLembur(100000);

        staff2[2] = new Staff();
        staff2[2].setNama("Joko Abdurrachman");
        staff2[2].setNip("20101014");
        staff2[2].setGolongan("5");
        staff2[2].setLembur(6);
        staff2[2].setGajiLembur(20000);
        m[1].setStaff(staff2);

        m[0].lihatInfo();
        m[1].lihatInfo();

    }
}
