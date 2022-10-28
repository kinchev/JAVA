import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    static void reverse(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        reverse(new int[]{1,2,3,4,5});
    }
}
