/*Given an array of ints, compute recursively the number of times that the value 11 appears in the array.

We'll use the convention of considering only the part of the array that begins at the given index.

 In this way, a recursive call can pass index+1 to move down the array.

 The initial call will pass in index as 0.


 */



import java.util.Arrays;
import java.util.Scanner;

public class ArrayContainsN2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = Arrays
                .stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int index = scanner.nextInt();

        System.out.println(containsN(num, index));
    }

    public static int containsN(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }
        if (nums[index] == 11) {
            return 1 + containsN(nums, index + 1);
        }

        return containsN(nums, index + 1);
    }

}

