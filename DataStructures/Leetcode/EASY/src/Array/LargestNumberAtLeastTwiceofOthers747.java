package Array;

import java.util.Arrays;

public class LargestNumberAtLeastTwiceofOthers747 {
        public static int dominantIndex(int[] nums) {
            int max=nums[1];
            int index=0;
            int count=0;
                for (int i = 0; i < nums.length; i++) {
                    
                    if(nums[i]>=max){
                        max=nums[i];
                        index=i;
                      
                    }

                }
                nums[index]=0;
                for (int i = 0; i < nums.length; i++) {
                    if(max/2>=nums[i]){
                        count++;
                    }
                }
              
                return count==nums.length ?index:-1;
            }
    public static void main(String[] args) {
        System.out.println((dominantIndex(new int[]{3,6,1,0})));
    }
}
