package String;

import java.util.Stack;

public class BalancedParenthesesHard {
    public static boolean isValid(String s){
            Stack<Character> st=new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='['  || s.charAt(i)=='{' ||s.charAt(i)=='('){
                    st.push(s.charAt(i));
                }else if(!st.isEmpty() &&(
                    st.peek()=='['&& s.charAt(i)==']'  ||s.charAt(i)=='}' && st.peek()=='{' ||s.charAt(i)==')'  && st.peek()=='('
                )){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }
            return st.isEmpty();
    }
    public static void main(String[] args) {
    System.out.println(isValid("{{{}}}[][][[[]]]"));    
    }

}
