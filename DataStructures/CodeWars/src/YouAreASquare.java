public class YouAreASquare {
    public static void main(String[] args) {
        System.out.println(isSquare(26 ));
    }

    public static boolean isSquare(int n) {
        if (n < 0) {
            return false;
        } else {
            if (Math.sqrt(n) % 1 == 0) {
                return true;
            }
        }
        return false;
    }
}
