/*Write a program that finds the sum of all elements in an integer array. Use recursion.

Note: In practice recursion should not be used here (instead use an iterative solution), this is just an exercise. */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] elements = reader.readLine().split("\\s+");
        SumReversedArray(elements, elements.length - 1);

    }

    public static void SumReversedArray(String[] elements, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(elements[index] + " ");
        SumReversedArray(elements, index - 1);
    }
}
