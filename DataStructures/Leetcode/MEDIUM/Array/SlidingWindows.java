package Array;



import java.util.Arrays;

public class SlidingWindows {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length<=1){
            return nums;
        }
        int j=0;
        int max=nums[j];
        int[] a=new int[nums.length-k+1];
        for (int i = 0; i < nums.length; i++) {
            if(nums.length+1==k){
                break;
            }
            max=nums[i];
            for (int l = i; l < k; l++) {
                
                if(nums[l]>max){
                   max=nums[l];
                }
                
            }
            a[j++]=max;
            k++;
           
            
        }
        return a;

    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(maxSlidingWindow( new int[]{1,3,-1,-3,5,3,6,7},3)));
    }
}
