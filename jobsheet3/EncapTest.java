package jobsheet3;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("james");
        encap.setAge(35);

        System.out.println("name " + encap.getName());
        System.out.println("age " + encap.getAge());
    }
}
