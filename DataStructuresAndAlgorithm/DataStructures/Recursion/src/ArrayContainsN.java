/*Given an array of ints, compute recursively if the array contains a 6.

We'll use the convention of considering only the part of the array that begins at the given index.
 In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.*/


import java.util.Arrays;
import java.util.Scanner;

public class ArrayContainsN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays
                .stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int index = scanner.nextInt();

        System.out.println(containsN(n,index));
    }
    public static boolean containsN(int[] nums, int index) {
        if(index >= nums.length) {
            return false;
        }
        return nums[index] == 6 || containsN(nums, index + 1);
    }

}
