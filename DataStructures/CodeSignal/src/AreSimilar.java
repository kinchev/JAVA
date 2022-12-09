import java.util.Arrays;

public class AreSimilar {

    static boolean solution(int[] a, int[] b) {
        int rs = 0, s1 = 1, s2 = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                rs++;
            s1 *= a[i];
            s2 *= b[i];
        }
        return rs <= 2 && s1 == s2;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3,4}, new int[]{4, 2, 3,1}));
    }
}
