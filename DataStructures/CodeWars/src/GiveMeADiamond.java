public class GiveMeADiamond {
    public static void main(String[] args) {
        System.out.println(print(5));
    }

    public static String print(int n) {
        StringBuilder output = new StringBuilder();
        if (n % 2 == 0 || n < 0) {
            return null;
        } else {
            while (n-- > 0) {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n - i; j++) {
                        output.append(" ");

                    }
                    for (int j = 1; j < i * 2 - 1; j++) {
                        output.append("*");

                    }
                    output.append("\n");
            }
                }

        }

        return output.toString();
    }
}
