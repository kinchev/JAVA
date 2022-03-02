package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String input, int k) {

        String minLexi = "";
        String maxLexi = "";
        maxLexi = minLexi = input.substring(0, k);

        for (int i = 0; i <= input.length() - k; i++) {
            String compare = input.substring(i, k + i);
            if (minLexi.compareTo(compare) > 0) {
                minLexi = compare;
            }
            if (maxLexi.compareTo(compare) < 0) {
                maxLexi = compare;
            }
        }


        return minLexi + "\n" + maxLexi;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
