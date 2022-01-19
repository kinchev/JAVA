import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Set<Short> set=new HashSet<Short>();
        for (short i = 0; i < 100; i++) {
            set.add(i);
            set.remove(i-1);

        }
        System.out.println(set.size());
        System.out.println(2.00-1.10);
    }
}
