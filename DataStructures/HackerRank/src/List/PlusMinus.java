package List;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int countMinus = 0;
        int countPlus = 0;
        int countZeroes = 0;
        int countNumbers = arr.size();
        for (Integer integer : arr) {
            if (integer == 0) {
                countZeroes++;
            } else if (integer > 0) {
                countPlus++;
            } else {
                countMinus++;
            }

        }
        System.out.printf("%.6f", (double)countPlus / countNumbers);
        System.out.println();
        System.out.printf("%.6f", (double)countMinus / countNumbers);
        System.out.println();
        System.out.printf("%.6f", (double)countZeroes / countNumbers);

    }

    public static void main(String[] args) {
       plusMinus(List.of(1,1,0,-1,-1));
    }
}
