/*Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).

Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).*/

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(count7(n));
    }

    private static int count7(int n) {
        int counter = 0;

        if (n % 10 == 7) counter++;

        if (n / 10 == 0) return counter;

        return counter + count7(n / 10);
    }


}
