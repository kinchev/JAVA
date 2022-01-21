import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCase {
    public static String camelCase(String str) {
        if(str.length()<2){
            return str;
        }

        String output = Arrays.stream(str.trim().split("\\s+")).map(s -> s.substring(0, 1).toUpperCase()+ s.substring(1)).collect(Collectors.joining());
        return output;
    }

    public static void main(String[] args) {

        System.out.println(camelCase("camel case word"));
    }
}
