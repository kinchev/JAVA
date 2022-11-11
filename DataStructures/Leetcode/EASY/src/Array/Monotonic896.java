package Array;

import java.util.Arrays;

public class Monotonic896{
    // public static boolean isMonotonic(int[] nums) {
    //     int j=0;

    //     int count=0;
    //     int count2=0;
    //     for(int i=1;i<nums.length;i++){
    //         if(nums[j]<=nums[i]){
    //             count++;
    //             j++;
    //         }else{
    //             count--;
    //             j++;
    //         }
    //     }
    //     j=0;
    //     for(int i=1;i<nums.length;i++){
    //         if(nums[j]>=nums[i]){
    //             count2++;
    //             j++;
    //         }else{
    //             count2--;
    //             j++;
    //         }
    //     }
    //     return count==nums.length-1 || count2==nums.length-1 ;
    // }
    public static boolean isMonotonic(int[] A) {
        boolean inc = true, dec = true;
        for (int i = 1; i < A.length; ++i) {
            inc &= A[i - 1] <= A[i];
            dec &= A[i - 1] >= A[i];
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{6,14,3,2,1}));
    }


}