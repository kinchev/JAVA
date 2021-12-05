/*Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.*/

import java.util.Scanner;

public class CountXCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countX(input));
    }

    private static int countX(String input) {
        if (input.length() == 0) {
            return 0;
        }
        if (input.charAt(0) == ('x')) {
            return 1 + countX(input.substring(1));
        }
        return (countX(input.substring(1)));
    }

}
