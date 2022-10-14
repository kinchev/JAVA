public class SubString {
    public static boolean check(String s) {
        return s.length() >= 2 && (s.charAt(0) ==
           s.charAt(1) || check(s.substring(1)));
     }
     public static void main(String[] args) {
        System.out.println(check("wescc"));
     }
    
}
