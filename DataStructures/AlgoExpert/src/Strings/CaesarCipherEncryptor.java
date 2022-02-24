package Strings;

public class CaesarCipherEncryptor {
    public static void main(String[] args) {
        System.out.println(caesarCypherEncryptor("xyz", 2));
    }

    public static String caesarCypherEncryptor(String str, int key) {
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()){
            int ascii = c+2;
            result.append((char)ascii);
        }
        return result.toString();
    }
}
