package String;

import java.util.HashMap;
import java.util.Map;

public  class IsomorphicString {
    public static boolean isIsomorphic(String s1, String s2) {
        char[] sToT=new char[256];
        char[] tToS=new char[256];

        for (int i = 0; i < s1.length(); i++) {
            char sChar=s1.charAt(i);
            char tChar=s2.charAt(i);
            if(sToT[sChar]==0 && tToS[tChar]==0){
                sToT[sChar]=tChar;
                tToS[tChar]=sChar;
            }else if(sToT[sChar]!=tChar){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }
    
}
