import java.util.*;

public class Sequence {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int count = 1;
        Deque<Integer>  queue= new LinkedList<>();
        queue.offer(k);
        if(n == 1) {
            System.out.println(k);
            return;
        }
        while (true) {
            int num = queue.remove();
            queue.offer(num + 1);
            if(++count == n) {
                System.out.println(queue.getLast());
                break;
            }
            queue.offer(2* num + 1);
            if(++count == n) {
                System.out.println(queue.getLast());
                break;
            }
            queue.offer(num + 2);
            if(++count == n) {
                System.out.println(queue.getLast());
                break;
            }
        }
    }
}