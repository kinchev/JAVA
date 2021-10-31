/*https://leetcode.com/problems/backspace-string-compare/*/

import java.util.Scanner;
import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        System.out.println(backspaceCompare(input1, input2));
    }

//    private static boolean ifEqual(String input1, String input2) {
//        Stack<Character> backspaceInput1 = new Stack<>();
//        Stack<Character> backspaceInput2 = new Stack<>();
//        for (char ch : input1.toCharArray()) {
//            if (ch != '#') {
//                backspaceInput1.push(ch);
//            } else if (ch == '#' && !backspaceInput1.isEmpty()) {
//                backspaceInput1.pop();
//
//
//            }
//        }
//        for (char ch1 : input2.toCharArray()) {
//            if (ch1 != '#') {
//                backspaceInput2.push(ch1);
//            } else if (ch1 == '#' && !backspaceInput2.isEmpty()) {
//                backspaceInput2.pop();
//
//
//            }
//        }
//        return backspaceInput1.equals(backspaceInput2);
//
//    }

    public static boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public static  String build(String S) {
        Stack<Character> ans = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }
}

