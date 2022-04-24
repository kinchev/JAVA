package KickStart;

import java.util.Arrays;
import java.util.Scanner;

public class New {
    public static double radiusOfInfinity(double[] arr) {
        double sum = 0;
        double units = 1;
        sum += arr[0] * arr[0] * Math.PI;
        for (int i = 1; i < 1000; i++) {
            if (i % 2 != 0) {
                units = arr[i - 1] * arr[i];
                sum += units*units * Math.PI;

            } else {
                units /= arr[i];
                if (units == 0) {
                    return sum;
                } else {
                    sum += units * units * Math.PI;
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < testCases; i++) {

            double[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();


            System.out.println(radiusOfInfinity(new double[]{5, 2, 5}));
        }
    }
}
