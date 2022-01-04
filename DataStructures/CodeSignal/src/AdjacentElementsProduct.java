public class AdjacentElementsProduct {
    public static void main(String[] args) {

    }

    int solution(int[] inputArray) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int sum = inputArray[i] * inputArray[i + 1];
            if (sum > max) {
                max = sum;
            }

        }

        return max;
    }
}
