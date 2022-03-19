package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        System.out.print("Enter the cells:");
        String input = scanner.nextLine();
        char[][] game=new char[input.length()/3][input.length()/3];

        System.out.println("---------");
        String space=" ";
        String surround="|";
        for (int i = 0; i < input.length(); i++) {
            game[i/3][i%3]=input.charAt(i);
        }
        System.out.println("---------");


    }


}

