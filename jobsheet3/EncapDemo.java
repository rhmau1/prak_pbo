package jobsheet3;

public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        // if (newAge > 10) {
        // age = 30;
        // } else {
        // age = newAge;
        // }

        // pertanyaan 2
        if (newAge < 18) {
            System.out.println("usia anda masih anak-anak");
        } else if (newAge > 30) {
            System.out.println("usia anda terlalu tua");
        } else {
            age = newAge;
        }
    }
}
