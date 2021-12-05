/*
Create a simple program that can convert a decimal number to its binary representation.
Implement an elegant solution using a Stack.
Print the binary representation back at the terminal.



Input          Output

10             1010

1024           10000000000

*/

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
        String binary = "";
        while (decimal != 0) {
            stack.push(decimal % 2);
            decimal /= 2;

        }
        for (int i = stack.size(); i > 0; i--) {

            binary += String.valueOf(stack.pop());
        }


        System.out.println(binary);
    }


}
