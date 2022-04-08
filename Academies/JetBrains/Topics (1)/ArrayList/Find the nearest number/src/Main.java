import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] intLine = scanner.nextLine().split(" ");
        int n = scanner.nextInt();
        int distance = Integer.MAX_VALUE;
        ArrayList<Integer> nums = new ArrayList<>(intLine.length);
        for (String s : intLine) {
            nums.add(Integer.parseInt(s));
        }
        for (Integer num : nums) {
            if (Math.abs(n - num) < distance) {
                distance = Math.abs(n - num);
            }
        }
        int finalDistance = distance;
        nums.removeIf(num -> Math.abs(n - num) > finalDistance);
        Collections.sort(nums);
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
    }
}
