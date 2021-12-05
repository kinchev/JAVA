/*Hot potato is a game in which children form a circle and start passing a hot potato.
The counting starts with the fist kid. Every nth toss the child left with the potato leaves the game.
 When a kid leaves the game, it passes the potato forward. This continues repeating until there is only one kid left.
Create a program that simulates the game of Hot Potato.  Print every kid that is removed from the circle.
 In the end, print the kid that is left last.

Input:
Gosho Pesho Misho Stefan Krasi
10


Output:
Removed Krasi

Removed Pesho

Removed Misho

Removed Gosho

Last is Stefan

 */


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> kids = new ArrayDeque<>(Arrays.asList(scanner.nextLine().split("\\s+")));
        int n = scanner.nextInt();
        int round = 1;
        while (kids.size() > 1) {
            String currentKid = kids.poll();
            if (round % n != 0) {
                kids.offer(currentKid);
            }else{
                System.out.println("Removed "+currentKid);
            }
            round++;
        }

        System.out.println("Last is "+kids.poll());
    }


}


