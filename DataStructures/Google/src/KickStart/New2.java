package KickStart;

import java.util.Scanner;

public class New2 {
    public static int arr(String n) {
        int count = 0;
        for (int i = 1; i <= Integer.parseInt(n); i++) {
            int pal = Integer.parseInt(n) % i;
            if (pal==0 && new StringBuilder(String.valueOf(i)).reverse().toString().equals(String.valueOf(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= testCases; i++) {
           String n = scanner.next();
            System.out.println("Case #"+i+": "+arr(n));

        }
    }
}
