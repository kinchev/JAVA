import java.util.Arrays;

public class DetectPangram {
    public static boolean check(String sentence){


        return sentence.chars().filter(Character::isLetter).map(Character::toLowerCase).distinct().count()==26;

    }
    public static void main(String[] args) {
        System.out.println(check("Madasd dasdasd "));
    }
}
