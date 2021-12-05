/*For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode.
If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
https://leetcode.com/problems/asteroid-collision/
Input: asteroids = [-2,-1,1,2]
Output: [-2,-1,1,2]
Explanation: The -2 and -1 are moving left, while the 1 and 2 are moving right.
Asteroids moving the same direction never meet, so no asteroids will meet each other.
*/

import java.util.*;

public class AsteroidCollision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] asteroids = Arrays
                .stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));

    }

    public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0 || stack.isEmpty()) {
                stack.offer(asteroids[i]);
            } else {
                while (true) {
                    int peek = stack.peekLast();
                    if (peek < 0) {
                        stack.offer(asteroids[i]);
                        break;

                    } else if (peek == -asteroids[i]) {
                        stack.pollLast();
                        break;

                    } else if (peek > -asteroids[i]) {
                        break;

                    } else {
                        stack.pollLast();
                        if (stack.isEmpty()) {
                            stack.offer(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }

        int[] arr = new int[stack.size()];
        for (int i = arr.length - 1; i >= 0; --i) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}