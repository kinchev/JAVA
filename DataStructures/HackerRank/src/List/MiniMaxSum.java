package List;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MiniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
       long min=arr.stream().mapToLong(l->l).reduce(0,Long::sum);
       min-=arr.get(arr.size()-1);
       long max=arr.stream().mapToLong(l->l).reduce(0,Long::sum);
       max-=arr.get(0);
//       long sum=arr.stream().mapToLong(l->l).sum();

        System.out.println((min) + " " + (max));
    }

    public static void main(String[] args) {
        miniMaxSum(Arrays.asList(7,69,2,221,8974));
    }
}
