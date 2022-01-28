public class ReverseInParentheses {
   public static String solution(String inputString) {
        //recursion
        int start = -1;
        int end = -1 ;
        for(int i = 0; i < inputString.length(); i++){
            if(inputString.charAt(i) == '('){
                start = i;
            }
            if(inputString.charAt(i) == ')'){
                end = i;
                String reverse = new StringBuilder(inputString.substring(start+1, end)).reverse().toString();
                return solution(inputString.substring(0, start) + reverse+ inputString.substring(end+1));
            }
        }
        return inputString;
    }

    public static void main(String[] args) {
        System.out.println(solution("foo(bar)baz(blim)"));
    }


}
