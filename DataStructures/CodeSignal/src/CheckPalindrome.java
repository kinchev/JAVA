public class CheckPalindrome {
    public static void main(String[] args) {

    }

    boolean solution(String inputString) {
        if (inputString.length() == 1) {
            return true;
        } else {
            StringBuilder reverseString = new StringBuilder();
            reverseString.append(inputString);
            reverseString.reverse();
            return inputString.equals(reverseString.toString());
        }

    }
}
