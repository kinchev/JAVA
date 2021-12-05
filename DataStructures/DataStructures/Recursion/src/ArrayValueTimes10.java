/*Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10.
We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array.
The initial call will pass in index as 0.*/

import java.util.Arrays;
import java.util.Scanner;

public class ArrayValueTimes10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays
                .stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int index = scanner.nextInt();
        System.out.println(value10(n, index));
    }

    private static boolean value10(int[] nums, int index) {
        if (index >= nums.length - 1) {
            return false;
        }
        return nums[index + 1] == 10 * nums[index] || value10(nums, index + 1);

    }
}
