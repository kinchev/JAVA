import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneNumber {
    public static boolean validPhoneNumber(String phoneNumber) {
        if(phoneNumber.length()!=14){
            return false;
        }else{
            Pattern phone=Pattern.compile("[(][0-9]{3}[)]\\s\\d{3}-\\d{4}");
            Matcher m=phone.matcher(phoneNumber);
            return m.matches();

        }
    }
    public static void main(String[] args) {
        System.out.println(validPhoneNumber("(123) 456-7890"));
    }
}
