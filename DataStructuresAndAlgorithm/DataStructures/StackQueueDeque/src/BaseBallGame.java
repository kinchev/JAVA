/*At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:

An integer x - Record a new score of x.
"+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
"D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
"C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
Return the sum of all the scores on the record.

Input: ops = ["5","-2","4","C","D","9","+","+"]
Output: 27
Explanation:
"5" - Add 5 to the record, record is now [5].
"-2" - Add -2 to the record, record is now [5, -2].
"4" - Add 4 to the record, record is now [5, -2, 4].
"C" - Invalidate and remove the previous score, record is now [5, -2].
"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
"9" - Add 9 to the record, record is now [5, -2, -4, 9].
"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
*/


import java.util.*;

public class BaseBallGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        System.out.println(calPoints(input));

    }

    private static int calPoints(String[] ops) {
        Deque<Integer> record = new ArrayDeque<>();
        for (int i = 0; i < ops.length; i++) {
            if (!ops[i].equals("C") && !ops[i].equals("D") && !ops[i].equals("+")) {
                record.push(Integer.parseInt(ops[i]));
            } else {
                if (ops[i].equals("C")) {
                    record.pop();

                } else if (ops[i].equals("D")) {
                    int sum = record.peek() * 2;

                    record.push(sum);


                } else if (ops[i].equals("+")) {
                    int n =record.pollFirst();
                    int sum =n+ record.peekFirst();
                    record.offerFirst(n);
                    record.push(sum);

                }
            }

        }



        int sum = record.stream().reduce(0, Integer::sum);

        return sum;
    }
}

