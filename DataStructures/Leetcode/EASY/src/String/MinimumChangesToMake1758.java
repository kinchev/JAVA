package String;

public class MinimumChangesToMake1758 {
    public static int minOperations(String s) {
        int n = s.length(), a = 0, b = 0;
        for (int i = 0; i < n; ++i) {
            //if (s.charAt(i) - '0' == i % 2) {
            if (s.charAt(i)-'0' != i % 2) {
                System.out.println(s.charAt(i)-'0');
                ++a;
            }else {
                ++b;
            }
        }
        return Math.min(a, b);
    }


    public static void main(String[] args) {
        System.out.println(minOperations("01110"));
    }
}
