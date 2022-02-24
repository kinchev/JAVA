package CrackingTheInterview;


public class SpaceComplexity {

    //O(n) space and time
    static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);

    }
//O(n)time O(1)space not exist simultaneously on the call stack
    static int pairSumSequence(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);
        }
        return sum;
    }

    private static int pairSum(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        int n = 8;
        System.out.println(sum(n));
        System.out.println(pairSumSequence(n));
    }
}
