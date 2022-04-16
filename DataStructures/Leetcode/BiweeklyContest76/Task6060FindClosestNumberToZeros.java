import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task6060FindClosestNumberToZeros {
    public static int findClosestNumber(int[] nums) {
        List<Integer> a = Arrays.stream(nums).boxed().collect(Collectors.toList());
        a.add(0);
        Collections.sort(a);
        int indexOfZero = a.indexOf(0);
        if (indexOfZero == a.size() - 1) {
            return a.get(indexOfZero - 1);
        } else if (indexOfZero == 0) {
            return a.get(indexOfZero + 1);
        } else {
            int x = a.get(indexOfZero + 1);
            int y = a.get(indexOfZero - 1);
            boolean closest = Math.abs(x) > Math.abs(y);
            if (closest) {
                return y;
            } else {
                return x;
            }

        }


    }

    public static void main(String[] args) {
        System.out.println(findClosestNumber(new int[]{1, 2}));
    }
}
