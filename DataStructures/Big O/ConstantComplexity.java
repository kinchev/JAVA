package com.telerikacademy.dsa;

public class ConstantComplexity {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int middle(int[] array) {
        int middleIndex = array.length / 2;
        return array[middleIndex];
    }
}
