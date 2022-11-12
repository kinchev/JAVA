
package String;
public class PalindromeNumber9{
    public static boolean isPalindrome(int x) {
        if(x<0){
        return false;}//10
        int rev=0;
        int temp=x;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        return x==rev;
        
    }
    public static void main(String[] args) {
       System.out.println(isPalindrome(12321));
       System.out.println(100%10);
    }
}