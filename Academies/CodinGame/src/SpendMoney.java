import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class SpendMoney {


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int max = in.nextInt();
        in.nextLine();

        String sList = in.nextLine();
        int N = in.nextInt();

        in.nextLine();
        String[] a = Arrays.stream(in.nextLine().split(",")).toArray(String[]::new);

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


        if (max >= Integer.parseInt(a[1])) {
            System.out.println("true");
            System.out.println(max-Integer.parseInt(a[1]));
        }
    }
}