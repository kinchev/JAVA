package KickStart;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CentauriPrime {
    private static String getRuler(String kingdom) {
        String ruler = "";
        kingdom=kingdom.toLowerCase();
        if(kingdom.endsWith("y")){
            ruler+="nobody";
        }else if(kingdom.matches(".*[aeiou]")){
            ruler+="Alica";
        }else{
            ruler+="Bob";
        }

        return ruler;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();

            for (int t = 1; t <= T; ++t) {
                String kingdom = in.next();
                System.out.println(
                        "Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
            }
        }
    }
}
