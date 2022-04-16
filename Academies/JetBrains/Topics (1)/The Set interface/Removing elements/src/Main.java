import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        return Stream.of(str.split(" ")).map(Integer::valueOf).collect(Collectors.toSet());
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(el -> el > 10);

    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}
