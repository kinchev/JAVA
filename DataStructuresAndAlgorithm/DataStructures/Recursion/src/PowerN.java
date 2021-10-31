/*Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).*/

import java.util.Scanner;

public class PowerN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int power = scanner.nextInt();
        System.out.println(powerN(base, power));


    }

    private static int powerN(int base, int power) {
        if (base == 0 || power == 0) {
            return 1;
        }

    return base* powerN(base,power-1);
    }
}
