import java.util.*;

public class TwoSumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int targetSum = Integer.parseInt(scanner.nextLine());
        System.out.println(Arrays.toString(twoNumberSum(numbers, targetSum)));
    }
    //    public static int[] twoNumberSum(int[] array, int targetSum) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                if(array[i]+array[j]==targetSum){
//                    return new int[]{array[i],array[j]};
//                }
//
//            }
//
//        }
//
//        return new int[0];
//    }
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> setNumbers = new HashSet<Integer>();
        for (int number : array) {
            int potentialMatch = targetSum - number;
            if (setNumbers.contains(potentialMatch)) {
                return new int[]{potentialMatch, number};
            } else {
                setNumbers.add(number);
            }

        }
        return new int[0];
    }

}



