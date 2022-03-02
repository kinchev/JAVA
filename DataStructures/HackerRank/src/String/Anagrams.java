package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        if (a.length() != b.length()) {
            return false;
        }
        char[] a1 = a.toCharArray();
        char[] a2 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a=scanner.nextLine();
        String b=scanner.nextLine();
        System.out.println(isAnagram(a,b)?"Anagrams":"Not Anagrams");
    }
}
