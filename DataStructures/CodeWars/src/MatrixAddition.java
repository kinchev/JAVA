import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class   MatrixAddition {
    //    public static int[][] matrixAddition(int[][] a, int[][] b) {
//        int n=a.length;
//        int m=b.length;
//        int[] c = Arrays.stream(a).flatMapToInt(IntStream::of).toArray();
//        int[] d = Arrays.stream(b).flatMapToInt(IntStream::of).toArray();
//        int[] result = new int[c.length];
//        Arrays.setAll(result, i -> c[i] + d[i]);
//        int[][] output = new int[n][n];
//        for (int i = 0; i <result.length; i++) {
//            output[i/n][i%m]=result[i];
//
//        }
//         return  output;
//    }
    public static int[][] matrixAddition(int[][] a, int[][] b) {
        IntStream.range(0, a.length * a.length)
                .forEach(n -> a[n / a.length][n % a.length] += b[n / a.length][n % a.length]);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(matrixAddition(new int[][]{{1, 2, 3}, {3, 2, 1}, {1, 1, 1}},
                new int[][]{{2, 2, 1}, {3, 2, 3}, {1, 1, 3}})));
    }
}
