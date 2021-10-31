
/*Given n of 1 or more, return the factorial of n, which is n (n-1) (n-2) ...
1. Compute the result recursively (without loops).*/

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {

            return n * factorial(n - 1);
        }
    }
}