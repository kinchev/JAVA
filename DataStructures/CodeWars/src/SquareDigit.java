import java.util.stream.Collectors;

public class SquareDigit {
    public static void main(String[] args) {
        int n = 1211;
        System.out.println(squareDigits(n));
    }

//    public static int squareDigit(int n) {
//        StringBuilder result = new StringBuilder();
//        if (n< 10) {
//            return n*n;
//        } else {
//            while (n > 0) {
//                int lastDigit = n % 10;
//                n = Math.abs(n) / 10;
//                String newDigit = String.valueOf(Math.round(Math.pow(lastDigit, 2)));
//                result.insert(0,newDigit);
//            }
//
//            return Integer.parseInt(String.valueOf(result));
//        }
//    }
//public static int squareDigits(int n) {
//    return Integer.parseInt(String.valueOf(n)
//            .chars()
//            .map(i -> Integer.parseInt(String.valueOf((char) i)))
//            .map(i -> i * i)
//            .mapToObj(String::valueOf)
//            .collect(Collectors.joining("")));
//}
private static final int BASE = 10;

    public static int squareDigits(int n) {
        if (n < BASE) {
            return n * n;
        }
        int digit = n % BASE;
        int squaredDigit = digit * digit;
        return squaredDigit + (squaredDigit < BASE ? BASE : BASE * BASE) * squareDigits(n / BASE);
    }

}
