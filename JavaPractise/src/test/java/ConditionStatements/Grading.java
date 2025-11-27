package ConditionStatements;

public class Grading {
    public static void main(String[] args){
        int studentPercentage= 93;
        String grade= "a";
        if(studentPercentage>90){
            grade= "A+ grade";
        }
        else if (studentPercentage>75){
            grade= "A grade";
        }
        else if (studentPercentage>60){
            grade="B grade";
        }
        else if (studentPercentage>40){
            grade= "C grade";
        }
        System.out.println("Student Percentage is: "+ studentPercentage+"%");
        System.out.println("Grade obtained is:"+ grade);
    }
}





//Grade Assignment:
//If a student's percentage is 90% or above, they get an A+ grade.
//If the percentage is between 75% and 90%, they get an A grade.
//If the percentage is between 60% and 75%, they get a B grade.
//If the percentage is between 40% and 60%, they get a C grade.
//        Otherwise, they fail.