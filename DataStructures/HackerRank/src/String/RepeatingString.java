package String;

public class RepeatingString {

    public static long repeatedString(String s, long n) {
        long sL = s.length();
        long repeat = n / sL;
        long a = 0;
        long count1=0;
        a =n- (sL * repeat);

        long count = 0;


        for (char ch : s.toCharArray()) {
            if (ch == 'a') {
                ++count;

            }
        }
        for (int i = 1; i >= a; i--) {
            if(s.charAt(s.length()-i)==('a')){
                count1++;
            }

        }


        return (count * repeat)+count1;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aab",
                882787));
    }
}
