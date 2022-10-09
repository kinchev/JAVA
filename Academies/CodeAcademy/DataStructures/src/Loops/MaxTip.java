package Loops;

public class MaxTip {
    public static int getTip(int budget) {
        int maxDigit = 0;
        while (budget>0) {
            int digit=budget%10;
            if(digit>maxDigit){
                maxDigit=digit;
            }
            budget/=10;
        }
    
    
            
        return maxDigit * 900;
      }
        
      public static void main(String []args) {
        // Try passing different arguments for your budget with varying numbers of digits, like 62, 374, 599, etc
        System.out.println(getTip(123));
      }
}
