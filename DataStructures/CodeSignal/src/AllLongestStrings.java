import java.util.Arrays;

public class AllLongestStrings {
    public static String[] solution(String[] inputArray) {
        int biggestString= Arrays.stream(inputArray).mapToInt(String::length).max().getAsInt();
        String[] result= Arrays.stream(inputArray).map(Object::toString).filter(s->s.length()==biggestString).toArray(String[]::new);
        return result;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"abaaaaa", "aasssss", "ad", "vcd", "aba"})));

    }
}
