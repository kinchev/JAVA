package String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String path = scanner.nextLine();
            try {
               Pattern pattern= Pattern.compile(path);

                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }

        }
    }
}
