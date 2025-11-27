package JAVATopics;

public class DifferentTypesOfMethods {
    public static void main(String[] args) {

        DifferentTypesOfMethods c0 = new DifferentTypesOfMethods();
        c0.printTheName();
        c0.multiplyTwoNumbers();
        c0.additionOfTwoNumbers();
        String c8 = c0.returnsValue();
        System.out.println(c8);

        int m9 = c0.valueWillReturn();
        System.out.println(m9);

        String s8 = c0.anotherExample();
        System.out.println(s8);
        c0.newMost("Jaswinder Singh");

        c0.additionWithParameters(58, 45);

        c0.reflectTheResult("jaswinder", 54, "Singh", 99);
    }




    // -----------------------------1. NO PARAMETERS NO RETURNING VALUES-----------------------------------------
    public void additionOfTwoNumbers() {
        int a = 65;
        int b = 65;
        System.out.println(a + b);
    }

    public void printTheName() {
        String s = "Jaswinder Singh";
        System.out.println(s);
    }

    public void multiplyTwoNumbers() {
        int c = 90;
        int u = 88;
        System.out.println(c * u);
    }

    //----------------------------2. NO PARAMETERS BUT RETURNS VALUES-------------------------------------
    public String returnsValue() {
        return "Jaswinder Singh with Return Value";
    }

    public int valueWillReturn() {
        return 98;
    }

    public String anotherExample() {
        return "You will definetely do it Jaswinder Singh just keep the focus";
    }

//----------------------------3. Takes Parameters but no return value------------------------------------------


    public void newMost(String name) {
        System.out.println(name);
    }

    public void additionWithParameters(int a, int b) {
        System.out.println(a + b);
    }

    public void reflectTheResult(String name, int a, String newname, int marks) {
        System.out.println("Name is:" + name + "Marks:" + a + "Another Name:" + newname + "Another Marks are:" + marks);
    }
    //---------------------4. Takes Parameters and Returns Values -----------------------------------------------



}