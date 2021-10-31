import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class Kata {
    public static void main(String[] args) {
        reverseWords("This is an example!");
    }

    public static String reverseWords(final String original)
    {
        String[] array = original.split(" ");

        if(array.length == 0)
            return original;


        int i = 0;
        for(String string : array){
            array[i] = new StringBuilder(string).reverse().toString();
            i++;
        }

        return String.join(" ",array);
    }
}
