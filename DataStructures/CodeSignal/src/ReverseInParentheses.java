import java.util.HashSet;
import java.util.Set;

public class ReverseInParentheses {
    public static String solution(String inputString) {
//        StringBuilder result = new StringBuilder();
//        String a=inputString.replaceAll("[()]"," ");
//        int firstIndex = a.indexOf(" ");
//        int lastIndex = a.lastIndexOf(" ");
//        String reversedString=result.append(a.substring(firstIndex,lastIndex)).reverse().toString();
//        result.append(a.substring(0, firstIndex)).append(a.substring(firstIndex,lastIndex)).append(a.substring(lastIndex));
//        String newOne=a.substring(0, firstIndex)+reversedString+a.substring(lastIndex);
//        return newOne.replaceAll("\\s+","");

        for (int i = 0; i < inputString.length(); i++) {


        }
    }

    public static void main(String[] args) {
        System.out.println(solution("foo(bar(baz))blim"));
    }
}
