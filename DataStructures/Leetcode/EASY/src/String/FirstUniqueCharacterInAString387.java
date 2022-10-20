package String;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirstUniqueCharacterInAString387 {
    // public int firstUniqChar(String s) {
    //     Map<Character,Integer> result=new HashMap<>();
    //     for(int i=0;i<s.length();i++){
    //         if(result.containsKey(s.charAt(i))){
    //             result.merge(i, 1, (a,b)->a+b);
    //         }else{
    //             result.putIfAbsent(s.charAt(i), 1);

    //     }
    // }
        

        
    // }

     
        public static int firstUniqChar(String s) {
            int[] count = new int[26];
            int n = s.length();
            // build char count bucket : <charIndex, count>
            for (int i = 0; i < n; i++) {            
                int index = s.charAt(i) - 'a';
                count[index]++;
            }
            
            // find the index
            for (int i = 0; i < n; i++) {
                int index = s.charAt(i) - 'a';
                if (count[index] == 1) {
                    return i;
                }
                    
            }
            return -1;
        }
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
