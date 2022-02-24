package Strings;

public class ReverseString {

        public static boolean isPalindrome(String str) {
            StringBuilder reverse=new StringBuilder(str);
            reverse.reverse();

            return str.equals(reverse.toString());
        }

    public static void main(String[] args) {
        System.out.println(isPalindrome("dasdasdasd"));
    }
}
