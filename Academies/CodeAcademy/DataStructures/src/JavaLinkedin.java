import java.util.ArrayList;
import java.util.List;

public class JavaLinkedin {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i = 0; i < list.size(); i ++) {
            list.add(i, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
    }





}
