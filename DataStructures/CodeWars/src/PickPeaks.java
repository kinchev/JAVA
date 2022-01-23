import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {


        public static Map<String,List<Integer>> getPeaks(int[] arr) {

        Map<String,List<Integer>> positionAndPeak = new HashMap<String,List<Integer>>() {{
            put("pos",   new ArrayList<Integer>() );
            put("peaks", new ArrayList<Integer>() );
        }};
        int posMax = 0;
        boolean matchAsc = false;

        for (int i = 1 ; i < arr.length ; i++) {
            if (arr[i-1] < arr[i]) {
                matchAsc = true;
                posMax = i;
            }
            if (matchAsc && arr[i-1] > arr[i]) {
                matchAsc = false;
                positionAndPeak.get("pos").add(posMax);
                positionAndPeak.get("peaks").add(arr[posMax]);
            }
        }
        return positionAndPeak;
    }
    public static void main(String[] args) {
        System.out.println(getPeaks(new int[]{2,1,3,1,2,2,2,2,1}));
    }
}
