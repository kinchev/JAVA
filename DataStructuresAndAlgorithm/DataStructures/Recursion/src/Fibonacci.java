/*
The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
 The first two values in the sequence are 0 and 1 (essentially 2 base cases).
 Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
 Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence
 */

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        long[] numbers = new long[number + 1];
        System.out.println(fib(number, numbers));
    }

    private static long fib(int n, long[] numbers) {
        if (numbers[n] == 0) {
            if (n == 0 || n == 1) {
                numbers[n] = n;
            } else {
                numbers[n] = fib(n - 1, numbers) + fib(n - 2, numbers);
            }
        }
        return numbers[n];
    }
}