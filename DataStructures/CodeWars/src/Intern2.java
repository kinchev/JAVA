import java.util.ArrayList;
import java.util.List;

public class Intern2 {
        public static List<Integer> reverseArray(List<Integer> arr) {

            for (int i = 0; i <arr.size(); i++) {
                arr.add(i, arr.get(arr.size() - 1));
                arr.remove(arr.size() - 1);

            }
            return arr;
        }
    public static void main(String[] args) {
    }
}
