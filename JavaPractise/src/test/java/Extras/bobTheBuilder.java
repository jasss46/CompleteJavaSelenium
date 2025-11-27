package Extras;

public class bobTheBuilder {


    int empid;
    int empsalary;
    String empName;

    public static void main(String[] args) {
        bobTheBuilder s1 = new bobTheBuilder();
        s1.concatEverything1();
        s1.newContacting();
        s1.thirdOne();
    }
    public void concatEverything1() {
        empid = 458;
        empsalary = 985558;
        empName = "jass";
        System.out.println(empid + " " + empsalary + " " + empName);
    }
    public void newContacting() {
        empid = 8587;
        empsalary = 888888;
        empName = "NewOne";
        System.out.println(empid + " " + empsalary + " " + empName);
    }
    public void thirdOne() {
        empid = 87;
        empsalary = 658785;
        empName = "hfiih";
        System.out.println(empid + " " + empsalary + " " + empName);
    }


}

