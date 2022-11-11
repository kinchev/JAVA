package Array;

public class MinCostClibing746{
    public static int minCostClimbingStairs(int[] cost) {
        // for (int i = 2; i < cost.length; i++) {
        //     cost[i]+=Math.min(cost[i-1],cost[i-2]);
        // }
        // return Math.min(cost[cost.length-1],cost[cost.length-2]);
        int step1=0;
        int step2=0;
        for (int i = cost.length-1; i >= 0; i--) {
            int currentStep=cost[i]+Math.min(step1,step2);
            step1=step2;
            step2=currentStep;
        }
        return Math.min(step1,step2);
    }

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
}