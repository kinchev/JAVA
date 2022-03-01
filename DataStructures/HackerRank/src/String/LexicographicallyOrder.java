package String;

import java.util.Scanner;

public class LexicographicallyOrder {
    public static int lengthInput(String a, String b) {
        return a.length()+ b.length();
    }

    public static String isLexicographicallyOrdering(String a, String b) {
        return a.compareTo(b) > 0 ? "Yes": "No";

    }

    public static String upperCase(String a, String b) {
        return a.substring(0,1).toUpperCase()+a.substring(1)+ " " + b.substring(0,1).toUpperCase()+b.substring(1);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(lengthInput(a, b));
        System.out.println(isLexicographicallyOrdering(a, b));
        System.out.println(upperCase(a, b));
    }
}
