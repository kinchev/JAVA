package BinarySearch;

public class BinarySearch704 {
    public static  int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mi = (hi + lo) >>>1;
            if (nums[mi] == target) return mi;
            else if (nums[mi] < target) lo = mi + 1;
            else hi = mi - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12},9));
    }
}
