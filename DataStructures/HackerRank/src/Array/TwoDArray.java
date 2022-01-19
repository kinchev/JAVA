package Array;

import java.util.List;

public class TwoDArray {

    public static int hourglassSum(List<List<Integer>> arr) {
        int width = arr.get(0).size()-2;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.size()-2; i++) {
            for (int j = 0; j < width; j++) {
               max= Math.max(max,arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2));

            }
        }
            return max;

    }

    public static void main(String[] args) {

    }
}
