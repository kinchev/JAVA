package CodeJam2022Round1;

import java.util.Arrays;
import java.util.Scanner;

public class d1000000 {
    public static int maxStraight(int[] numbersOfSides,int dice){
        int max=0;
        int minDice=1;
        Arrays.sort(numbersOfSides);
        for (int i = 0; i < numbersOfSides.length; i++) {
            if(numbersOfSides[i]>=minDice &&  minDice<=dice){
                max++;
                minDice++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= testCases; i++) {
            int dice=Integer.parseInt(scanner.nextLine());
            int[] numbersOfSides= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println("Case #"+i+":"+" "+maxStraight(numbersOfSides,dice));
        }
    }
}
