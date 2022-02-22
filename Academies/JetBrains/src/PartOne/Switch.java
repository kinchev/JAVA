package PartOne;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long firstNumber=Long.parseLong(scanner.next());
    String operator=scanner.next();
    long secondNumber =Long.parseLong(scanner.next());
    long sum;
    switch (operator) {
        case "+":
            if(secondNumber==0){
                System.out.println("Division by 0!");
                break;
            }
            System.out.println(firstNumber+ secondNumber);
            break;
        case "-":
            if(secondNumber==0){
                System.out.println("Division by 0!");
                break;
            }
            System.out.println(firstNumber- secondNumber);
            break;
        case "/":
            if(secondNumber==0){
                System.out.println("Division by 0!");
                break;
            }
            System.out.println(firstNumber/ secondNumber);
            break;
        case "*":
            if(secondNumber==0){
                System.out.println("Division by 0!");
                break;
            }
            System.out.println(firstNumber* secondNumber);
        default:
            System.out.println("Unknown operator");
    }
    }

}
