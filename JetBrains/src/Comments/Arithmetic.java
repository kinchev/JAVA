package Comments;

public class Arithmetic {
    static int a=25/2;
    static double b=25/2;
    static int c =24%2;
    static int d =12%13;
    static int e =12241%100;
    static int f =41/10;
    static int g =4%10;

    static int number = 12241;
    static int digit = ((number % 100) / 10) % 10;
    static boolean a1=true;
    static boolean a2=false;

    static boolean bol =a1&&a2;
    static boolean bol1 =a1||a2;
    static boolean bol2 =a1^a2;
    static boolean bol3 =!a1&&a2;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(digit);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(bol);
        System.out.println(bol1);
        System.out.println(bol2);
        System.out.println(bol3);
        int n = 0;
        System.out.print(++n);
        System.out.print(n++);
        System.out.print(n++);
    }

}
