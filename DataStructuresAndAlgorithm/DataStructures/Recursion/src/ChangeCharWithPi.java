/*
 * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".*/


import java.util.Scanner;

public class ChangeCharWithPi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(change(input));
    }

    private static String change(String input) {
        if (input.length() <= 1) {
            return input;
        }
        if (input.substring(0, 2).equals("pi")) {
            return "3.14" + change(input.substring(2));
        }
        return input.charAt(0) + change(input.substring(1));
    }
}
