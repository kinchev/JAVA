

public class ShortestWord {
    public static int findShort(String s) {
        int min = Integer.MAX_VALUE;
        String[] split = s.split(" ");
        for (String s1 : split) {
            int countLetter = s1.length();
            if (countLetter < min) {
                min = countLetter;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findShort("as aaaaa aaaaaa"));
    }
}
