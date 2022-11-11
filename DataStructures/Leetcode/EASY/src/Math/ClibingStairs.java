package Math;

public class ClibingStairs {
    public static int climbStairs(int n) {
        int x=0;
        int y=1;
        int sum=0;
        while(n-->0){
            sum=x+y;
            x=y;
            y=sum;
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
