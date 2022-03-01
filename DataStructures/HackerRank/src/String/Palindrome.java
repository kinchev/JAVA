package String;

import java.util.Scanner;

public class Palindrome {
    public static String palindrome(String input){
        StringBuilder result=new StringBuilder(input);
        return result.reverse().toString().equals(input)?"Yes" :"No";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(palindrome(input));
    }
}
