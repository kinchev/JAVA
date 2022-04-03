package CodeJam2022Round1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PunchedCards {
    public static void symbols(int row, int col) {
        System.out.print("..");
        IntStream.range(0, col-1).forEach(i -> System.out.print("+-"));
        System.out.print("+");
        System.out.println();
        System.out.print("..");
        IntStream.range(0, col-1).forEach(i -> System.out.print("|."));
        System.out.println("|");
        for (int i = 0; i < row-1; i++) {
            IntStream.range(0, col).forEach(a -> System.out.print("+-"));
            System.out.print("+");
            System.out.println();
            IntStream.range(0, col).forEach(a -> System.out.print("|."));
            System.out.print("|");
            System.out.println();

        }
        IntStream.range(0, col).forEach(i -> System.out.print("+-"));
        System.out.print("+");
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases=scanner.nextInt();
        for (int i = 1; i <= testCases; i++) {
            int row = scanner.nextInt();
            int col=scanner.nextInt();
            System.out.println("Case #"+i+":");
            symbols(row, col);
        }

    }
}
