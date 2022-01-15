import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = ar.get(i);

            if (!pairs.containsKey(key)) {
                pairs.put(key,1);
            } else {
                pairs.put(key,pairs.get(key)+1);
            }
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
            Integer a = entry.getValue();
            if (a >= 2) {
                count += ((int) Math.floor(a / 2));
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(sockMerchant(10, List.of(
                1, 1, 3, 1, 2, 1, 3, 3, 3, 3)));
    }
}
