package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedSquaredArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] inputArray = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(sortedSquaredArray(inputArray));
    }

    public static int[] sortedSquaredArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * array[i];


        }
        Arrays.sort(newArray);
        return newArray;
    }
}
