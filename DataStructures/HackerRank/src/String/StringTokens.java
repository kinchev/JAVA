package String;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();
        if (a.length() > 0) {
            String[] input = Arrays.stream(a.split("[!,?._'@\\s]+")).map(String::trim).toArray(String[]::new);

            System.out.println(input.length);
            for (int i = 0; i < input.length; i++) {

                    System.out.println(input[i]);
                }

        } else {
            System.out.println(0);
        }
    }

}
