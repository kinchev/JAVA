public class MakeAlternatingBinaryString1758{
    public static int minOperations(String s) {
        int res = 0, n = s.length();
        for (int i = 0; i < n; ++i)
            if (s.charAt(i) - '0' != i % 2)
                res++;
        return Math.min(res, n - res);
    }
    public static void main(String[] args) {
        System.out.println(minOperations("10110101101010011111111000001"));
    }
}