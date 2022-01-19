

public class CountTheDigit {
    public static int nbDig(int n, int d) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int sqrt = i * i;
            String a = String.valueOf(sqrt);
            if (a.contains(String.valueOf(d))) {
                String spaces = a.replaceAll(String.valueOf(d), " ");
                long q = spaces.chars().filter(c -> c == (int) ' ').count();
                count+=q;
            }


        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(nbDig(25, 1));
    }
}
