import java.util.List;
import java.util.stream.Collectors;

public class CommonCharacterCount {
    public static int solution(String s1, String s2) {
        List<Character> newS1 = s1.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        List<Character> newS2 = s2.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

        int count = 0;
        for (int i = 0; i < newS1.size(); i++) {
            for (int j = 0; j < newS2.size(); j++) {
                if (newS1.get(i) == newS2.get(j)) {
                    count++;
                    newS2.remove(j);
                    break;



                }

            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(solution("abca", "xyzbac"));

    }
}
