import org.junit.Test;



import static org.junit.Assert.assertArrayEquals;

public class MergeSort {
    public static void mergeSort(int[] inputArray, int n) {
        if (n < 2) {
            return;

        }

        int midIndex = n / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[n - midIndex];
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];

        }
        for (int i = midIndex; i < n; i++) {
            rightHalf[i - midIndex] = inputArray[i];

        }
        mergeSort(leftHalf, midIndex);
        mergeSort(rightHalf, n-midIndex);

        merge(inputArray, leftHalf, rightHalf, midIndex, n - midIndex);
    }

    private static void merge(int[] input, int[] leftArray, int[] rightArray, int leftLength, int rightLength) {
        int i = 0, j = 0, k = 0;
        while(i< leftLength && j< rightLength){
            if(leftArray[i]<=rightArray[j]){
                input[k++]=leftArray[i++];
            }else{
                input[k++]=rightArray[j++];
            }
        }
        while(i< leftLength){
            input[k++]=leftArray[i++];
        }
        while (j < rightLength) {
            input[k++] = rightArray[j++];
        }
    }
    @Test
    public void positiveTest() {
        int[] actual = { 5, 6, 1, 2, 3, 4, 1 };
        int[] expected = { 1, 1, 2, 3, 4, 5, 6 };
        MergeSort.mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    public static void main(String[] args) {
        mergeSort(new int[]{1, 2, 4342, 2, 4, 1, 3, 2, 5},9);

    }
}
