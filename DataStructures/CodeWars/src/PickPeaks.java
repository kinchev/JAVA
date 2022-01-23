import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        if(arr.length<=1){
            return new HashMap<String, List<Integer>>();
        }

        Map<String, List<Integer>> output = new HashMap<String, List<Integer>>();
        for (int i = 0; i < arr.length; i++) {
            int peak = arr[i + 1];
            if(i==arr.length-2){
                return output;
            }
            if (peak > arr[i] && peak > arr[i + 2]) {
                output.put(String.valueOf(arr[i+1]),List.of(peak));
            }

        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(getPeaks(new int[]{1,2,3,6,4,1,2,3,2,1}));
    }
}
