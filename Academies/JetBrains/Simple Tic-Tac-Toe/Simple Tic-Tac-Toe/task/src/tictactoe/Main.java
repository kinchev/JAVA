package tictactoe;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("X O X\nO X O\nX X O");
//        Scanner scanner = new Scanner(System.in);
//        String input=scanner.nextLine();
//        System.out.println("---------");
//        System.out.println("| "+ input.charAt(0) + " "+ input.charAt(1) + " "+input.charAt(2) +" |");
//        System.out.println("| "+ input.charAt(3) + " "+ input.charAt(4) + " "+input.charAt(5) +" |");
//        System.out.println("| "+ input.charAt(6) + " "+ input.charAt(7) + " "+input.charAt(8) +" |");
//        System.out.println("---------");
//
//
//        if (input.contains("_")) {
//
//            if ((countX(input) - countO(input) > 1) || (countO(input) - countX(input) > 1)) {
//                System.out.println("Impossible");
//            } else if (bothWon(input)) {
//                System.out.println("Impossible");
//            } else if (xWon(input)) {
//                System.out.println("X wins");
//            } else if (oWon(input)) {
//                System.out.println("O wins");
//            } else {
//                System.out.println("Game not finished");
//            }
//        } else {
//
//            if (bothWon(input)) {
//                System.out.println("Impossible");
//            } else if (xWon(input)) {
//                System.out.println("X wins");
//            } else if (oWon(input)) {
//                System.out.println("O wins");
//            } else {
//                System.out.println("Draw");
//            }
//        }
//    }
//    public static int countX(String str) {
//
//        int count = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if (str.charAt(i) == 'X') {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int countO(String str) {
//
//        int count = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if (str.charAt(i) == 'O') {
//                count++;
//            }
//        }
//        return count;
//    }
//    public static boolean bothWon(String str) {
//
//        if (((str.charAt(0) + str.charAt(1) + str.charAt(2) == 88 * 3) || (str.charAt(0) + str.charAt(1) + str.charAt(2) == 79 * 3)) &&
//                ((str.charAt(3) + str.charAt(4) + str.charAt(5) == 88 * 3) || (str.charAt(3) + str.charAt(4) + str.charAt(5) == 79 * 3))) {
//            return true;
//        }
//
//        else if (((str.charAt(0) + str.charAt(1) + str.charAt(2) == 88 * 3) || (str.charAt(0) + str.charAt(1) + str.charAt(2) == 79 * 3)) &&
//                ((str.charAt(6) + str.charAt(7) + str.charAt(8) == 88 * 3) || (str.charAt(6) + str.charAt(7) + str.charAt(8) == 79 * 3))) {
//            return true;
//        }
//
//        else if (((str.charAt(3) + str.charAt(4) + str.charAt(5) == 88 * 3) || (str.charAt(3) + str.charAt(4) + str.charAt(5) == 79 * 3)) &&
//                ((str.charAt(6) + str.charAt(7) + str.charAt(8) == 88 * 3) || (str.charAt(6) + str.charAt(7) + str.charAt(8) == 79 * 3))) {
//            return true;
//        }
//
//        else if (((str.charAt(0) + str.charAt(3) + str.charAt(6) == 88 * 3) || (str.charAt(0) + str.charAt(3) + str.charAt(6) == 79 * 3)) &&
//                ((str.charAt(1) + str.charAt(4) + str.charAt(7) == 88 * 3) || (str.charAt(1) + str.charAt(4) + str.charAt(7) == 79 * 3))) {
//            return true;
//        }
//
//        else if (((str.charAt(0) + str.charAt(3) + str.charAt(6) == 88 * 3) || (str.charAt(0) + str.charAt(3) + str.charAt(6) == 79 * 3)) &&
//                ((str.charAt(2) + str.charAt(5) + str.charAt(8) == 88 * 3) || (str.charAt(2) + str.charAt(5) + str.charAt(8) == 79 * 3))) {
//            return true;
//        }
//
//        else if (((str.charAt(1) + str.charAt(4) + str.charAt(7) == 88 * 3) || (str.charAt(1) + str.charAt(4) + str.charAt(7) == 79 * 3)) &&
//                ((str.charAt(2) + str.charAt(5) + str.charAt(8) == 88 * 3) || (str.charAt(2) + str.charAt(5) + str.charAt(8) == 79 * 3))) {
//            return true;
//        }
//
//        return false;
//    }
//    public static boolean xWon(String str) {
//
//        if ((str.charAt(0) == 'X' && str.charAt(1) == 'X' && str.charAt(2) == 'X') ||
//                (str.charAt(3) == 'X' && str.charAt(4) == 'X' && str.charAt(5) == 'X') ||
//                (str.charAt(6) == 'X' && str.charAt(7) == 'X' && str.charAt(8) == 'X') ||
//                (str.charAt(0) == 'X' && str.charAt(3) == 'X' && str.charAt(6) == 'X') ||
//                (str.charAt(1) == 'X' && str.charAt(4) == 'X' && str.charAt(7) == 'X') ||
//                (str.charAt(2) == 'X' && str.charAt(5) == 'X' && str.charAt(8) == 'X') ||
//                (str.charAt(0) == 'X' && str.charAt(4) == 'X' && str.charAt(8) == 'X') ||
//                (str.charAt(2) == 'X' && str.charAt(4) == 'X' && str.charAt(6) == 'X')) {
//            return true;
//        }
//
//        return false;
//    }
//
//    public static boolean oWon(String str) {
//
//        if ((str.charAt(0) == 'O' && str.charAt(1) == 'O' && str.charAt(2) == 'O') ||
//                (str.charAt(3) == 'O' && str.charAt(4) == 'O' && str.charAt(5) == 'O') ||
//                (str.charAt(6) == 'O' && str.charAt(7) == 'O' && str.charAt(8) == 'O') ||
//                (str.charAt(0) == 'O' && str.charAt(3) == 'O' && str.charAt(6) == 'O') ||
//                (str.charAt(1) == 'O' && str.charAt(4) == 'O' && str.charAt(7) == 'O') ||
//                (str.charAt(2) == 'O' && str.charAt(5) == 'O' && str.charAt(8) == 'O') ||
//                (str.charAt(0) == 'O' && str.charAt(4) == 'O' && str.charAt(8) == 'O') ||
//                (str.charAt(2) == 'O' && str.charAt(4) == 'O' && str.charAt(6) == 'O')) {
//            return true;
//        }
//
//        return false;
//    }














//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter cells : ");
//
//        String input = sc.nextLine();
//
//        printGrid(input);
//
//        while (true) {
//
//            try {
//
//                System.out.print("Enter the coordinates: ");
//
//                int x = sc.nextInt();
//                int y = sc.nextInt();
//                int target = -1;
//
//                if ((x < 1 || x > 3) || (y < 1 || y > 3)) {
//                    System.out.println("Coordinates should be from 1 to 3!");
//                } else {
//                    if (x == 1) {
//                        target = y - x;
//                    } else if (x == 2) {
//                        target = x + y;
//                    } else if (x == 3 && y == 1) {
//                        target = 6;
//                    } else if (x == 3 && y == 2) {
//                        target = 7;
//                    } else if (x == 3 && y == 3) {
//                        target = 8;
//                    }
//                }
//
//                if (target != -1 && input.charAt(target) == '_') {
//
//                    char[] arr = input.toCharArray();
//                    arr[target] = 'X';
//                    input = String.valueOf(arr);
//                    break;
//                } else {
//                    System.out.println("This cell is occupied! Choose another one!");
//                }
//
//            } catch (InputMismatchException e) {
//                System.out.println("You should enter numbers!");
//                sc.next();
//            }
//        }
//
//        printGrid(input);
//    }
//
//    public static void printGrid(String str) {
//
//        System.out.println("---------");
//
//        System.out.println("| " + str.charAt(0) + " " + str.charAt(1) + " " + str.charAt(2) + " |");
//        System.out.println("| " + str.charAt(3) + " " + str.charAt(4) + " " + str.charAt(5) + " |");
//        System.out.println("| " + str.charAt(6) + " " + str.charAt(7) + " " + str.charAt(8) + " |");
//
//        System.out.println("---------");
//    }
        Scanner sc = new Scanner(System.in);

        char[] grid = new char[9];

        Arrays.fill(grid, ' ');

        printGrid(grid);

        for (int i = 0; i < 9; i++) {

            try {

                System.out.print("Enter the coordinates: ");

                int x = sc.nextInt();
                int y = sc.nextInt();
                int target = -1;

                if ((x < 1 || x > 3) || (y < 1 || y > 3)) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    i--;
                    continue;
                } else {
                    if (x == 1) {
                        target = y - x;
                    } else if (x == 2) {
                        target = x + y;
                    } else if (x == 3 && y == 1) {
                        target = 6;
                    } else if (x == 3 && y == 2) {
                        target = 7;
                    } else if (x == 3 && y == 3) {
                        target = 8;
                    }
                }

                if (target != -1 && grid[target] == ' ') {

                    grid[target] = i % 2 == 0 ? 'X' : 'O';
                    printGrid(grid);

                    if (xWon(grid)) {
                        System.out.println("X wins");
                        return;
                    } else if (oWon(grid)) {
                        System.out.println("O wins");
                        return;
                    }
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                    i--;
                }

            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
                i--;
                sc.next();
            }
        }

        System.out.println("Draw!");
    }

    public static void printGrid(char[] grid) {

        System.out.println("---------");

        System.out.println("| " + grid[0] + " " + grid[1] + " " + grid[2] + " |");
        System.out.println("| " + grid[3] + " " + grid[4] + " " + grid[5] + " |");
        System.out.println("| " + grid[6] + " " + grid[7] + " " + grid[8] + " |");

        System.out.println("---------");
    }

    public static boolean xWon(char[] grid) {

        if ((grid[0] == 'X' && grid[1] == 'X' && grid[2] == 'X') ||
                (grid[3] == 'X' && grid[4] == 'X' && grid[5] == 'X') ||
                (grid[6] == 'X' && grid[7] == 'X' && grid[8] == 'X') ||
                (grid[0] == 'X' && grid[3] == 'X' && grid[6] == 'X') ||
                (grid[1] == 'X' && grid[4] == 'X' && grid[7] == 'X') ||
                (grid[2] == 'X' && grid[5] == 'X' && grid[8] == 'X') ||
                (grid[0] == 'X' && grid[4] == 'X' && grid[8] == 'X') ||
                (grid[2] == 'X' && grid[4] == 'X' && grid[6] == 'X')) {
            return true;
        }

        return false;
    }

    public static boolean oWon(char[] grid) {

        if ((grid[0] == 'O' && grid[1] == 'O' && grid[2] == 'O') ||
                (grid[3] == 'O' && grid[4] == 'O' && grid[5] == 'O') ||
                (grid[6] == 'O' && grid[7] == 'O' && grid[8] == 'O') ||
                (grid[0] == 'O' && grid[3] == 'O' && grid[6] == 'O') ||
                (grid[1] == 'O' && grid[4] == 'O' && grid[7] == 'O') ||
                (grid[2] == 'O' && grid[5] == 'O' && grid[8] == 'O') ||
                (grid[0] == 'O' && grid[4] == 'O' && grid[8] == 'O') ||
                (grid[2] == 'O' && grid[4] == 'O' && grid[6] == 'O')) {
            return true;
        }

        return false;
    }
    }

