
/*Write a program that keeps count of how many animals of each kind are on the ark and whether they are an even or not.

Oh by the way he wants the list sorted in alphabetical order. Jeez... picky much?
Input:

5
fish
crocodile
moose
moose
bald eagle

Output:

bald eagle 1 No
crocodile 1 No
fish 1 No
moose 2 Yes
*/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoahArk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> animals = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = scanner.nextLine();
            animals.merge(key,1,(a,b)->a+b);

        }
    animals.forEach((key,value)-> System.out.println(key+" "+value+" "  + (value%2==0 ? "Yes" : "No")));
    }


}
