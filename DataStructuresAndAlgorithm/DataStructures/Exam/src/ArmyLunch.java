import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ArmyLunch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] soldiers = scanner.nextLine().split(" ");
        Deque<String> order = new ArrayDeque<>();
        List<String> S = new ArrayList<>();
        List<String> C = new ArrayList<>();
        for (int i = 0; i < soldiers.length; i++) {
            if (soldiers[i].substring(0, 1).equals("C")) {
                C.add(soldiers[i]);


            } else if (soldiers[i].substring(0, 1).equals("P")) {
                order.addLast(soldiers[i]);
            } else if (soldiers[i].substring(0, 1).equals("S")) {
                S.add(soldiers[i]);

            }

        }
        for (int i = C.size() - 1; i >= 0; i--) {
            order.addFirst(C.get(i));

        }
        for (int i = S.size() - 1; i >= 0; i--) {
            order.addFirst(S.get(i));

        }


        for (String s : order) {
            System.out.print(s + " ");

        }
    }
}
