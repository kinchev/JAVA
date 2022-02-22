package PartOne;



public class Exceptions {
    public static void checkTheCode (String input) {
        boolean result = Boolean.parseBoolean(input);
        result = !result;
        String output = String.valueOf(result);
        System.out.println(output);
    }

    public static void main(String[] args) {
        checkTheCode("dasda");

    }
}
