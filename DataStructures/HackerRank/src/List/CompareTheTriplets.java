package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice=0;
        int bob=0;
        List<Integer> c=new ArrayList<>();
        for (int i = 0; i <a.size(); i++) {
            if(a.get(i)>b.get(i)){
                alice+=1;
            }else if(a.get(i)<b.get(i)){
                bob+=1;
            }
        }
        c.add(alice);
        c.add(bob);
        return c;
    }



    public static void main(String[] args) {

    }
}
