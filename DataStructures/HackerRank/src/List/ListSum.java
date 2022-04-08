package List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListSum {
    public static int simpleArraySum(List<Integer> ar) {
        return ar.stream().mapToInt(Integer::intValue).sum();
    }
    public static void main(String[] args) {
        System.out.println(simpleArraySum(List.of(1,2,3,4,10,15)));
    }
}
