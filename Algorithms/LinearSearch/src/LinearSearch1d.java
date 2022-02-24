public class LinearSearch1d {
//    O(n)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 10, 40};
        int target = 10;
        System.out.println(linearSearch(arr, target));
    }
}
