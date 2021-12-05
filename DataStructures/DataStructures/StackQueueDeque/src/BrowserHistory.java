/*Write a program which takes 2 types of browser instructions:

Normal navigation: a URL is set, given by a string

The string "back" that sets the current URL to the last set URL

After each instruction the program should print the current URL. If the back instruction can’t be executed, print
"no previous URLs". The input ends with "Home" command, then simply you have to stop the program. */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> history = new ArrayDeque<>();

        while (true) {
            String line = scanner.nextLine();
            String output = "";
            switch (line) {
                case "back":
                    if (history.size() <= 1) {
                        output = "no previous URLs";
                    } else {
                        history.pop();
                        output = history.peek();
                    }
                    break;
                case "Home":
                    return;

                default:
                    output = line;
                    history.push(line);
            }
            System.out.println(output);
        }
    }


}