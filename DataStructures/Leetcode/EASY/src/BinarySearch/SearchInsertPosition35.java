package BinarySearch;

public class SearchInsertPosition35 {
    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int mid = (low + high) >>> 1;
           if(nums[mid]>=target){
               high=mid;
           }else{
               low=mid+1;
           }
        }
           return low;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,7},7));
    }
}
