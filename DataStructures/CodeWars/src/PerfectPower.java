import java.util.Arrays;
import java.util.stream.Collectors;

public class PerfectPower {
    public static int[] isPerfectPower(int n) {

//        int logOfN = (int) Math.ceil(Math.log(n) / Math.log(2));
            int upperBounder=(int)Math.ceil(Math.sqrt(n));
        for (int i = 2; i <= n / i; i++) {
            for (int j = 0; j <= upperBounder; j++) {
                if (n % i == 0 && Math.pow(i, j) == n) {
                    return new int[]{i, j};
                }

            }
        }
        return null;
    }
//    public static int[] isPerfectPower(int n) {
//        List<int[]> list = IntStream.range(2, (int) sqrt(n) + 1)
//                .filter(i -> n % i == 0)
//                .mapToObj(i -> new int[] {i, (int)(log(n) / log(i) + 0.00000001)})
//                .filter(i -> pow(i[0], i[1]) == n)
//                .limit(1)
//                .collect(Collectors.toList());
//
//        return list.size() == 0 ? null : list.get(0);
//    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(isPerfectPower(81)));
    }
}
