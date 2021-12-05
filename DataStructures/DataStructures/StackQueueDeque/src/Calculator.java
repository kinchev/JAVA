/*Create a simple calculator that can evaluate simple expressions that will not hold any operator different from addition and subtraction.
There will not be parentheses or operator precedence. */

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Deque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack, input);

        while (stack.size() > 1) {
            int first = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int second = Integer.parseInt(stack.pop());

            switch (operation) {
                case "+":
                    stack.push(String.valueOf(first + second));
                    break;
                case "-":
                    stack.push(String.valueOf(first - second));
                    break;
            }


        }
        System.out.println(stack.peek());
/*        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(Integer.parseInt(input[0]));
        for (int i = 1; i < input.length; i++) {
            String operator = input[i];
            int num = Integer.parseInt(input[++i]);
            int stackNum = stack.pop();
            if ("+".equals(operator)) {
                stack.push(num + stackNum);

            } else if ("-".equals(operator)) {
                stack.push(stackNum - num);

            }
        }
        System.out.println(stack.peek());

    }
}*/
    }
}