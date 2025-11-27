package Extras;

public class    NewDate {
    public static void main(String[] args) {
        NewDate n8 = new NewDate();
        n8.propertyOne(88, 0);
        System.out.println(n8.propertyTwo());
        n8.propertyThree();
        n8.evenOddChecker(55);
        n8.greatestOfThreeNumbers(555, 454, 44);
        n8.lowestOfThreeNumbers(888, 88, 8);
        n8.multiplicationOfANumber(88);
        n8.secondHighestNumber(5, 8, 45);
    }

    public void propertyOne(int i, int j) {
        try {
            System.out.println(i / j);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Newly Formatted");
        }
    }

    public int propertyTwo() {
        return 5;
    }

    public void propertyThree() {
        for (int m = 0; m <= 10; m += 1)
            System.out.print(m);
    }


    private void evenOddChecker(int a) {

        if (a % 2 == 0) {
            System.out.println("The given number is even: " + a);
        } else {
            System.out.println("The given number is odd: " + a);
        }
    }

    private void greatestOfThreeNumbers(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("a is the greatest number:" + a);
        } else if (b > a && b > c) {
            System.out.println("b is the greatest number:" + b);
        } else {
            System.out.println("c is the greatest number:" + c);
        }
    }

    private void lowestOfThreeNumbers(int y, int q, int z) {
        if (y < q && y < z) {
            System.out.println("y is the lowest number" + y);
        } else if (q < y && q < z) {
            System.out.println("q is the lowest number" + q);
        } else {
            System.out.println("z is the lowest number" + z);
        }
    }

    public void multiplicationOfANumber(int t) {

        for (int q = 1; q <= 10; q++) {
            System.out.println(t + "*" + q + "=" + t * q);
        }

    }

    public void secondHighestNumber(int a, int b, int c) {

        if (a > b && a < c || a < b && a > c) {
            System.out.println("a is the second highest number");
        } else if (b > a && b < c || b > c && b < a) {
            System.out.println("b is the second highest number");
        } else {
            System.out.println("c is the second number");
        }
    }



}
