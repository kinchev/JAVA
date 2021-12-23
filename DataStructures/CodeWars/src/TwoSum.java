import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int pointerA = 0;
        int pointerB = numbers.length - 1;
        Arrays.sort(numbers);
        if (numbers[pointerA] + numbers[pointerB] == target) {
            return new int []{pointerA, pointerB};
        } else if (numbers[pointerA] + numbers[pointerB] > target) {
            pointerB -= 1;
        } else if (numbers[pointerA] + numbers[pointerB] < target) {
            pointerA += 1;

        }
        return null;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,9,4,2,2};
        int targetSum=7;
        System.out.println(Arrays.toString(twoSum(array, targetSum)));
    }
}
