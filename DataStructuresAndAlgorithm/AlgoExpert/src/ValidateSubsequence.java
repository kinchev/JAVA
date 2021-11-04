import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValidateSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> array = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> sequence = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(isValidSubsequence(array, sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIndex = 0;
        for (Integer number : array) {


            if (sequence.size() == seqIndex) {
                break;
            }
            if (Objects.equals(sequence.get(seqIndex), number)) {
                seqIndex++;
            }

        }
        return seqIndex == sequence.size();

    }

}

