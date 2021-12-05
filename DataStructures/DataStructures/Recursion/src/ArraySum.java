/*Write a program that finds the sum of all elements in an integer array. Use recursion.

Note: In practice recursion should not be used here (instead use an iterative solution), this is just an exercise. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays
                .stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(SumArray(array, array.length-1));


    }

    public static int SumArray(int[] array, int index) {
        if (index ==0) {
            return array[index];
        }


        return array[index]+SumArray(array,index-1);
    }
}
