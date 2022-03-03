package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> list = new ArrayList<>(a);


        if (list.size() == d) {
            return list;
        } else {
            for (int i = 0; i < d; i++) {
              int remove=list.remove(0);
              list.add(remove);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(rotLeft(List.of(1, 2, 3, 4, 5), 4));
    }
}
