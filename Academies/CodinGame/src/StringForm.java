import java.util.Scanner;

public class StringForm {
    public static String result(String input, String form) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < form.length(); i++) {

            char b = form.charAt(i);
            if (Character.isUpperCase(b)) {
                result.append(Character.toUpperCase(input.charAt(i)));
            } else if (Character.isWhitespace(b)) {
                result.append(" ");
               input=input.substring(0,i)+" "+input.substring(i);
            } else if (!Character.isLetter(b)) {
                result.append(b);
                input=input.substring(0,i)+b+input.substring(i);
            }else if(Character.isLowerCase(b)){
                result.append(Character.toLowerCase(input.charAt(i)));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String f = in.nextLine();
        System.out.println(result(s,f));
    }
}
