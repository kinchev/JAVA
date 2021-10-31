/*We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on.
 Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.*/


import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(rows(n));
    }

    private static int rows(int n) {
        if (n <= 1) {
            return n;
        }
        return n+ rows(n-1);
    }

}
