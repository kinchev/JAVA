/*Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.*/


import java.util.Scanner;

public class CountXTimesHi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countHi(input));
    }

    private static int countHi(String input) {
        if (input.length() < 2) {
            return 0;
        }
        if (input.substring(0, 2).equals("hi")) {
            return 1 + countHi(input.substring(2));
        }
    return countHi(input.substring(1));
    }
}
