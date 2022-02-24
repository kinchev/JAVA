package Strings;

public class CaesarCipherEncryptor {
    public static String caesarCypherEncryptor(String str, int key) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            int ascii = (c + (key%26));
            if (ascii <= 122) {
                result.append((char)ascii);
            } else {
                ascii = 96 + ascii % 122;
                result.append((char)ascii);
            }
        }


        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(caesarCypherEncryptor("xyz", 2));
    }

}
