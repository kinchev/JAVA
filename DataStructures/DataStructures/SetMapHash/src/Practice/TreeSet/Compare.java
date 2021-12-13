package Practice.TreeSet;

import java.util.*;

public class Compare {
    public static void main(String[] args) {
        Map<Integer, String> a = new TreeMap<>();
        Map<Integer, String> b = new HashMap<>();
        a.put(1, "Ivan");
        a.put(1, "Ivan");
        b.put(1, "Ivan");
        b.put(1, "Ivan");

        System.out.println(a);
        System.out.println(b);
    }


}
