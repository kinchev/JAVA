public class RomanNumerals {
    private static final String[] ROMAN= {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public static String toRoman(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < NUMBERS.length; i++) {

        }
        return result.toString();
    }

    public static int fromRoman(String romanNumeral) {
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(toRoman(2008));
    }
}
