import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>(Arrays.asList("a", "b", "c"));
        System.out.println(number(input));
    }

    public static List<String> number(List<String> lines) {
        List<String> output = new ArrayList<>();
        int counter = 1;
        if (lines.isEmpty()) {
            return new ArrayList<>(0);
        } else {
            for (String line : lines) {
                output.add(String.format("%s: %s", counter, line));
                counter++;

            }
        }
        return output;
    }
}
