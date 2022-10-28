package String;

import java.util.regex.*;

public  class AddNUmberPresentInString {
    public static long result(String s){
        // Pattern pattern=Pattern.compile("[0-9]+");
        // String macher=pattern.matcher(s);
        long sum=0;  
        String[] res=s.split("[^0-9]+");
          for (int i = 0; i < res.length; i++){
            if(res[i].isBlank()){
              continue;
            }else{
            sum+=Long.parseLong(res[i]);
          } 

        }
          return sum;
    }
    public static void main(String[] args) {
        System.out.println(result("Gl123a45sdsadas333333sd908...//oo6r"));
    }
}
