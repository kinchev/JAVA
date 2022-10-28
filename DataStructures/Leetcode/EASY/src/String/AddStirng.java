package String;

public class AddStirng {
    public static String addStrings(String num1, String num2) {
        int i=num1.length()-1;
          int j=num2.length()-1;
          StringBuilder result=new StringBuilder();
          int carry=0;
          
          
          
        while(i>=0 || j>=0){
              int d1=i>=0 ? num1.charAt(i)-'0':0;
              int d2=j>=0 ? num2.charAt(j)-'0':0;
              int sum=d1+d2+carry;
              carry=sum/10;
              result.append(sum%10);
              i--;j--;
              
              
            }
        if(carry!=0){
              result.append(carry);
            }
            return result.reverse().toString();
        }
        
        public static void main(String[] args) {
            System.out.println(addStrings("99", "99"));
        }
    
              
              
  
          

    
    
}
