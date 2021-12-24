public class SquareDigit {
    public static void main(String[] args) {
        int n = 12113;
        System.out.println(squareDigit(n));
    }

    public static int squareDigit(int n) {
        StringBuilder result = new StringBuilder();
        if (n< 10) {
            return n*n;
        } else {
            while (n > 0) {
                int lastDigit = n % 10;
                n = Math.abs(n) / 10;
                String newDigit = String.valueOf(Math.round(Math.pow(lastDigit, 2)));
                result.insert(0,newDigit);
            }

            return Integer.parseInt(String.valueOf(result));
        }
    }
}
