package Array;

import java.util.Arrays;

public class SquaresOfASortedArray977 {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]=(int)Math.pow(nums[i],2);
        }
        int[] result=new int [nums.length];
        int head=0;
        int tail=nums.length-1;

         for (int index = nums.length-1; index>=0 ; index--) {
            if(nums[head]>nums[tail]){
                result[index]=nums[head];
                head++;

               

            }else{
                result[index]=nums[tail];
                tail--;
            }
            
        }
        return result;
    }
// 49,9,4,9,121
//9,4,9,49,121
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4,-1,0,3,10})));
    }
}
