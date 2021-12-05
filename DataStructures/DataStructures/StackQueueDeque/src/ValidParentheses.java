//https://leetcode.com/problems/valid-parentheses/

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();
        System.out.println(isValid(brackets));

    }

    public static boolean isValid(String parentheses) {
        if (parentheses.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stackBrackets = new Stack<>();
        for (char ch : parentheses.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stackBrackets.push(ch);
            } else if (ch == ')' && !stackBrackets.isEmpty() && stackBrackets.peek() == '(') {

                stackBrackets.pop();
            } else if (ch == '}' && !stackBrackets.isEmpty() && stackBrackets.peek() == '{') {
                stackBrackets.pop();

            } else if (ch == ']' && !stackBrackets.isEmpty() && stackBrackets.peek() == '[') {
                stackBrackets.pop();
            }
        }
        return stackBrackets.isEmpty();
    }


}
