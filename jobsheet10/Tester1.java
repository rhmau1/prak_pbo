package jobsheet10;

public class Tester1 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("John Doe", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Jane Smith", 6);
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        System.out.println(pEmp.getEmployeeInfo());
        System.out.println(iEmp.getEmployeeInfo());
        System.out.println(eBill.getBillInfo());
        System.out.println(pEmp.getPaymentAmount());
        Employee e;
        Payable p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}
