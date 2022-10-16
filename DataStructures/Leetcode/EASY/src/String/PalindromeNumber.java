package String;
public class PalindromeNumber {
    public static  boolean isPalindrome(int x) {
        String xToStr=String.valueOf(x);
       StringBuilder check=new StringBuilder(xToStr);
       if(xToStr.equals(check.reverse().toString())){
           return true;
       }else{
           return false;
       }
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(1000021));
    }
}
