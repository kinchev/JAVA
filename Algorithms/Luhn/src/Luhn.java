import java.util.Arrays;
import java.util.stream.Stream;

public class Luhn {
    public static boolean validateCreditCardNumber(String n) {
        int[] cardNumber = Stream.of(n.split("")).mapToInt(Integer::parseInt).toArray();
        int doubleValue = 1;
        for (int i = cardNumber.length - 2; i >= 0; i -= 2) {
            doubleValue = cardNumber[i] *= 2;
            if (doubleValue > 9) {
                doubleValue = doubleValue% 10 + 1;
            }
            cardNumber[i] = doubleValue;
        }
        int sum=Arrays.stream(cardNumber).sum();
        return sum%10==0;
    }

    public static void main(String[] args) {
        System.out.println(validateCreditCardNumber("91"));
    }
}
