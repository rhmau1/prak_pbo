package jobsheet10;

public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("susi", 6);
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        Employee e[] = { pEmp, iEmp };
        Payable p[] = { pEmp, eBill };
        // Employee e2[] = {pEmp, iEmp, eBill}; //ini error
    }
}
