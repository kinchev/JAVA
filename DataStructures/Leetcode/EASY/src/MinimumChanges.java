public class MinimumChanges {
    public static int minOperations(String s) {
        int change = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 != c - '0'){
                change++;
            }
        }
        return Math.min(change, s.length() - change);
    }


    public static void main(String[] args) {
        System.out.println(minOperations("10010100"));
    }
}
