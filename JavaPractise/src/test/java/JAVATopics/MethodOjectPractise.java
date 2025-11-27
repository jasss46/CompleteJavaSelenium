package JAVATopics;

public class MethodOjectPractise {


    public int add(int a, int b){
        int c=a+b;
        System.out.println(c);

        return c;

    }

    public int subtract(int x, int y) {
        int z = x - y;
        System.out.println(z);

        return z;
    }

        public int multiply(int v, int w){
            int k= v+w;
            System.out.println(k);

            return k;

        }

    public static void main(String[] args) {
        MethodOjectPractise obj = new MethodOjectPractise();
        obj.add(99, 77);
        obj.subtract(200, 89);
        obj.multiply(299, 49);
    }
    }

