import java.util.Arrays;

public class AreSimilar {

    static boolean solution(int[] a, int[] b) {
        if(Arrays.equals(a, b)){
            return true;
        }else{
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if(a[i] = b[j])

                }
            }
        }

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}, new int[]{2, 1, 3}));
    }
}
