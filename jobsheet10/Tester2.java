package jobsheet10;

public class Tester2 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("dedi", 500);
        Employee e;
        e = pEmp;
        System.out.println(e.getEmployeeInfo());
        System.out.println("-----------------------------");
        System.out.println(pEmp.getEmployeeInfo());
    }
}
