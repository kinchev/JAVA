package Strings;

public class RunLengthEncoding {
    public static String runLengthEncoding(String string) {
        StringBuilder result = new StringBuilder();
        int length = 1;
        for (int i = 1; i < string.length(); i++) {
            char currentCharacter = string.charAt(i);
            char previousCharacter = string.charAt(i - 1);
            if (currentCharacter != previousCharacter || length == 9) {
                result.append(Integer.toString(length));
                result.append(previousCharacter);
                length=0;
            }
            length += 1;
        }
        result.append(Integer.toString(length));
        result.append(string.charAt(string.length()-1));
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(runLengthEncoding("AAAAAAAAAAAAAABBCCE"));
    }
}
