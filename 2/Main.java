public class Main {

     public static int a = 100;
     public static int b = 200;

    public static void main(String[] args) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
