import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class Task2 {
    public static int solution(String S) {
        Stack<Integer> result = new Stack<>();
        String[] S1 = S.split("\\s+");
        for (int i = 0; i < S1.length; i++) {
            if (S1[i].matches("\\d+")) {
                result.push(Integer.parseInt(S1[i]));

            } else if (Objects.equals(S1[i], "-")) {
                if (result.size() < 2) {
                    return -1;
                } else {
                    int topMost = result.pop();
                    int nextOne = result.pop();
                    int sum = topMost - nextOne;
                    if (sum < 0) {
                        return -1;
                    }
                    result.push(sum);
                }

            } else if (Objects.equals(S1[i], "+")) {
                if (result.size() < 2) {
                    return -1;
                } else {
                    int topMost = result.pop();
                    int nextOne = result.pop();
                    int sum = topMost + nextOne;
                    if (sum > 1048575) {
                        return -1;
                    }
                    result.push(sum);
                }
            } else if (Objects.equals(S1[i], "POP")) {
                if (result.isEmpty()) {
                    return -1;
                }
                result.pop();

            } else if (Objects.equals(S1[i], "DUP")) {
                if (result.isEmpty()) {
                    return -1;
                }

                result.push(result.peek());
            }
        }
        if (result.isEmpty()) {
            return -1;
        } else {
            return result.pop();
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("13 DUP 4 POP 5 DUP + DUP + -"));
    }
}
