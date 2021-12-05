/*We have a number of bunnies and each bunny has two big floppy ears.
 We want to compute the total number of ears across all the bunnies recursively
 (without loops or multiplication).*/


import java.util.Scanner;

public class BunnyEars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(bunnyEars(n));
    }

    public static int bunnyEars(int n) {
        if (n == 0) {
            return 0;


        } else {

            return 2+ bunnyEars(n-1);


        }

    }
}
