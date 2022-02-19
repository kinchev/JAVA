package KickStart;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Candy {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int testCases=in.nextInt();
        for (int i = 1; i <=testCases ; i++) {

            int candyBags= in.nextInt();
            int kids=in.nextInt();
            in.nextLine();
            int[] numberOfCandiesInBags= Arrays.stream(in.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int remainCandies=(Arrays.stream(numberOfCandiesInBags).reduce(0,Integer::sum))%kids;

            System.out.printf("Case #%s: %s%n",i,remainCandies);
        }
    }
}