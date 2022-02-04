import java.util.Arrays;
import java.util.List;

public class Tests {
    public static String reverseString(String text) {
        // base case
        if (text.length() == 0) {
            return text;
        } else {
            // recursive call
            return reverseString(text.substring(1)) + text.charAt(0);
        }
    }

    public static void main(String[] args) {
        String str = new String("howdy");
        // calling recursive function
        String reverse = reverseString(str);
        System.out.println(reverse); // Prints: ydwoh
    }
}
