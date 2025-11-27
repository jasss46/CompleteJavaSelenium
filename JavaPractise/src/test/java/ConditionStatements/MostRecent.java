package ConditionStatements;

public class MostRecent {
    public static void main(String[] args) {

        double bonus = 0;
        double salary = 5888;
        int years = 8;
      double   netSalary= 0;

        if (years > 10) {
            bonus = 0.10 * salary;
        } else if (years >=5 && years<=10) {
            bonus = 0.07 * salary;
        } else  {
            bonus = 0.05 * salary;
        }
        netSalary= salary+bonus;
        System.out.println("number of years would be:"+years+"years");
        System.out.println(bonus);
        System.out.println(salary);
        System.out.println(netSalary);

    }

}


//Employee Bonus Calculation: Write a Java program that calculates an employee’s bonus based on experience:
//More than 10 years → 10% of salary
//Between 5 and 10 years → 7% of salary
//Less than 5 years → 5% of salary
