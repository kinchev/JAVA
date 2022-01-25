import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortByHeight {
    public static int[] solution(int[] a) {
        List<Integer> minusOne = Arrays.stream(a).boxed().collect(Collectors.toList());
        int[] index = new int[(int) Arrays.stream(a).filter(s -> s == -1).count()];
        int k = 0;
        int j=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                index[k++] = i;
                minusOne.remove(i-j);
                j++;

            }

        }
        Collections.sort(minusOne);
        for (int i = 0; i < index.length; i++) {
            minusOne.add(index[i],-1);
        }
        return minusOne.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{-1, 150, 190, 170, -1, -1, 160, 180})));

    }


}
