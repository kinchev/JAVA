/*Write a program that reads a four-digit number and displays the sum of its digits

1213 => 1 + 2 + 1 + 3 = 7
2346 => 2 + 3 + 4 + 6 = 15
*/


import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum(n));


    }

    private static int sum(int n) {
        if (n < 10) {
            return n;
        }


        return (n%10 + sum(n/10));
        }

}
