/*We are given an arithmetical expression with brackets. Scan through the string and extract each sub-expression.

Print the result back at the terminal.

Input                                       Output

1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5        (2 + 3)
                                           (3 + 1)
                                           (2 - (2 + 3) * 4 / (3 + 1))

(2 + 3) - (2 + 3)                          (2 + 3)
                                           (2 + 3)

*/

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        String input = scanner.nextLine();


        for (int i = 0; i < input.length(); i++) {


            if (input.charAt(i) == '(') {
                stack.push(i);



            } else if (input.charAt(i) == ')') {
                int startIndex = stack.pop();
                input.substring(startIndex, i + 1);
                System.out.println( input.substring(startIndex, i + 1));
            }
        }

    }
}
