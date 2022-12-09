import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases =Integer.parseInt(scanner.nextLine());
        int well=0;
        int basket=0;
        for (int i = 0; i < numberOfTestCases; i++) {
           well=Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < 5; i++) {
            well--;
            basket++;
        }
        while(well>=0){

        }

    }
}
