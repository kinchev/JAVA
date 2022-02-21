package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparisonSorting {
    public static List<Integer> countingSort(List<Integer> arr) {
        int[] newArr =new int[100];
        for (int i = 0; i < arr.size(); i++) {
           newArr[arr.get(i)] +=1;

        }
        return Arrays.stream(newArr).boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(countingSort(List.of(1,3,1,4,4,1,2)));
    }
}
