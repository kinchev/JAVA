///*Given a string of lowercase characters (a - z),
//uppercase characters (A - Z) and special symbols ("!", "-", " ", "#", etc.),
//output the lowercase, uppercase and symbol characters that occurs the most times throughout the string.
// If two characters occur equally as much in a given category, output the one with lower ASCII value.
//
//Input:
//1.Telerik Academy rocks!!!
//2.YES!
//3.Yes, English can be weird. It can be understood through tough thorough thought, though.
//
//
//Output:
//1.! 3
//  e 3
//  A 1
//2.! 1
//    -
//  E 1
//3.  13
//  h 10
//  E 1
//  */
//
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//public class JustCount {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Map<String, Integer> count = new HashMap<>();
//        String[] text = scanner.nextLine().split("");
//        for (int i = 0; i < text.length; i++) {
//            count.merge(text[i], 1, (a, b) -> a + b);
//
//        }
//        int max = Integer.MIN_VALUE;
//
//        for (Map.Entry<String, Integer> entry : count.entrySet()) {
//            if (entry.getKey().matches("[\\p{javaLowerCase}]")) {
////                System.out.println(Collections.max(count.values().matches("[\\p{javaLowerCase}]")));
//                if (entry.getValue() > max) {
//                    max = entry.getValue();
//                }
//                }
//
//            if (entry.getValue().equals(max)) {
//                System.out.println(entry.getKey());
//            }
//
////        map2.forEach(
////                (key, value)
////                        -> map1.merge(
////                        key,
////                        value,
////                        (v1, v2)
////                                -> v1.equalsIgnoreCase(v2)
////                                ? v1
////                                : v1 + ", " + v2));
//        }
//    }
//}