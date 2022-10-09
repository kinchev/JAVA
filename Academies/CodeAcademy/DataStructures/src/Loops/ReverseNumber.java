package Loops;

public class ReverseNumber {
    public static int getReverseBudget(int budget) {
        int reverseBudget = 0;
        while (budget > 0) {
            int digit = budget % 10;
            budget /= 10;
            reverseBudget = (reverseBudget * 10) + digit;
          }
    
            
        return reverseBudget;
      }
        
      public static void main(String []args) {
        // Try passing different arguments for your budget with varying numbers of digits, like 62, 374, 599, etc
        System.out.println(getReverseBudget(12345));
      }
}
