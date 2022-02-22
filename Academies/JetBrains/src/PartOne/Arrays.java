package PartOne;

public class Arrays {

    public static int method(int[] array, int... vararg) { return 1; }
    public static void main(String[] args) {
        char[] array = { 'a', 'b', 'c', 'd' };

        char[] array1 = new char[1];

//        char[] array2 = new char[-1];
//
        char[] array3 = new char[0];
//
//        char[] array4 = new char[10000000000000];

        int[] nums={1,2,3,4};
        for (int i = 0; i < nums.length; i++) { System.out.println(nums[i]); }

//        for (int i = 0; i <= 3; i++) { System.out.println(nums[0]); }

//        for (int i = 1; i <= 3; i++) { System.out.println(nums[i]); }

        for (int i = 0; i <= 3; i++) { System.out.println(nums[i]); }

        for (int i = nums.length - 1; i >= 0; i--) { System.out.println(nums[i]); }

        method(new int[] { 1, 2, 3 }, 4, 5);

//        method(1, 2, 3);

        method(new int[] { 1, 2, 3 }, 4, 5, 6);

        method(new int[] { 1, 2, 3 });

//        method();
    }
}
