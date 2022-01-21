import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        char[] input = s.toCharArray();
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int sum = roman.get(input[input.length - 1]);
        for (int i = input.length - 2; i >= 0; i--) {
            if (roman.get(input[i]) >= roman.get(input[i+1])) {
                sum+= roman.get(input[i]);
            } else {
                sum -= roman.get(input[i]);
            }

        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
