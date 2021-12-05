import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Code {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secretCode = scanner.nextLine();
        String cipher = scanner.nextLine();

        CipherDecoder decoder = new CipherDecoder(secretCode, cipher);

        ArrayList<String> originalMessages = decoder.Decode();

        Collections.sort(originalMessages);

        System.out.println(originalMessages.size());
        for (String message : originalMessages) {
            System.out.println(message);
        }
    }

    public static class CipherDecoder {

        private final ArrayList<CipherItem> cipherItems;
        private final String secretCode;
        private ArrayList<String> originalMessages;

        public CipherDecoder(String secretCode, String cipher) {
            cipherItems = new ArrayList<CipherItem>();

            StringBuilder currentCipher = new StringBuilder();
            char lastChar = ' ';
            for (char ch : cipher.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    if (currentCipher.length() > 0) {
                        cipherItems.add(new CipherItem(lastChar, currentCipher.toString()));
                        currentCipher.setLength(0);
                    }
                    lastChar = ch;
                } else {
                    currentCipher.append(ch);
                }
            }
            if (currentCipher.length() > 0) {
                cipherItems.add(new CipherItem(lastChar, currentCipher.toString()));
            }

            this.secretCode = secretCode;
        }

        private char[] currentOriginalMessage = new char[100];

        private void AddSolution(char[] currentOriginalMessage) {
            StringBuilder originalMessage = new StringBuilder();
            for (char c : currentOriginalMessage) {
                if (c < 'A' || c > 'Z') {
                    break;
                }
                originalMessage.append(c);
            }
            originalMessages.add(originalMessage.toString());
        }

        private void DecodeWithRecursion(int index, int wordIndex) {
            if (index == secretCode.length()) {
                AddSolution(currentOriginalMessage);
                return;
            }
            if (index > secretCode.length()) {
                return;
            }
            for (CipherItem item : cipherItems) {
                if (secretCode.length() >= index + item.getCode().length() && secretCode.substring(index, index + item.getCode().length()).equals(item.getCode())) {
                    currentOriginalMessage[wordIndex] = item.getLetter();
                    DecodeWithRecursion(index + item.getCode().length(), wordIndex + 1);
                    currentOriginalMessage[wordIndex] = ' ';
                }
            }
        }


        public final ArrayList<String> Decode() {
            originalMessages = new ArrayList<String>();
            DecodeWithRecursion(0, 0);
            return originalMessages;
        }

    }

    public static class CipherItem {
        private char Letter;

        public final char getLetter() {
            return Letter;
        }

        public final void setLetter(char value) {
            Letter = value;
        }

        private String Code;

        public final String getCode() {
            return Code;
        }

        public final void setCode(String value) {
            Code = value;
        }

        public CipherItem(char letter, String code) {
            this.setLetter(letter);
            this.setCode(code);
        }
    }
}
