import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Keypad {
//    public static int presses(String phrase) {
//        String pattern1 = "[ADGJMPTW *1#]";
//        String pattern2 = "[BEHKNQUX0]";
//        String pattern3 = "[CFILORVY]";
//        String pattern4 = "[SZ]";
//        String pattern5 = "[79]";
//        int sum = 0;
//
//        for (int i = 0; i < phrase.length(); i++) {
//            String a = String.valueOf(phrase.charAt(i)).toUpperCase();
//
//            if (Pattern.matches(pattern1, a)) {
//                sum += 1;
//            } else if (Pattern.matches(pattern2, a)) {
//                sum += 2;
//            } else if (Pattern.matches(pattern3, a)) {
//                sum += 3;
//            } else if (Pattern.matches(pattern4, a)) {
//                sum += 4;
//            }else if (Pattern.matches(pattern5, a)) {
//                sum += 5;
//            }
//
//        }
//        return sum;
//    }
//private static final List<String> KEYS = Arrays.asList(
//        "1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#");
//
//    public static int presses(String phrase) {
//        return phrase.toUpperCase().chars()
//                .flatMap(c -> KEYS.stream().mapToInt(k -> k.indexOf(c) + 1))
//                .filter(i -> i > 0)
//                .sum();
//    }
static String[] keys = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};

    public static int presses(String phrase) {
        int nPresses = 0;

        for (char c : phrase.toUpperCase().toCharArray())
            for (String s : keys)
                nPresses += s.indexOf(c) + 1;
        return nPresses;
    }

    public static void main(String[] args) {
        System.out.println(presses("AK'W*PKw"));
    }
}
