

public class IsLucky {
    public static boolean solution(int n) {
        String number = String.valueOf(n);
        int half = number.length() / 2;
        String first = number.substring(0, half);
        String second = number.substring(half);
        int sum1 = first.chars().map(s -> (int) s).sum();
        int sum2 = second.chars().map(s -> (int) s).sum();
        return sum1 == sum2;

    }

    public static void main(String[] args) {
        System.out.println(solution(1230));
    }
}
