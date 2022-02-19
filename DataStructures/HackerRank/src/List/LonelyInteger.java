package List;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static List.Result.lonelyinteger;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        Map<Integer, Integer> result = new HashMap<>();
        a.forEach(number ->
                result.merge(number, 1, Integer::sum)

        );
        return result.entrySet().stream().filter(entry -> 1 == entry.getValue())
                .map(Map.Entry::getKey).findFirst().get();
    }


}

class Solution1 {
    public static void main(String[] args)  {
        System.out.println(lonelyinteger(Arrays.asList(1,2,3,4,3,2,1)));

    }
}
