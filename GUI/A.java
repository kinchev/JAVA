import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class A {
    public static int[] topKFrequent(int[] nums, int k) {
      
        
     
        

    
    Map<Integer,Integer> a=new HashMap<>();
    
    for (int i = 0; i < nums.length; i++) {
        
         a.merge(nums[i],1,(x,y)->x+y);
     }
    
    
    List<Integer> list = new ArrayList<Integer>(a.values());
    Collections.sort(list, Collections.reverseOrder());
    List<Integer> top5 = list.subList(0, k);
    
    return top5;
    // int[] populatedZip = a.entrySet().parallelStream()
    // .sorted(Map.Entry.<Integer, Integer>comparingByValue())
    // .limit(k)
    // .mapToInt(entry -> entry.getKey())
    // .toArray();
    //  System.out.println(Arrays.toString(populatedZip));
    // return populatedZip;
    //         List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(a.entrySet());
    // Collections.sort( entries, Comparator.comparing(
    //     Map.Entry::getValue, (v1, v2) -> {
    //         return v2.compareTo(v1);
    //     }));
    // }
    }
    public static void main(String[] args) {
        topKFrequent(new int[]{1,1,1,2,2,2,2,3}, 2);
    }
}


