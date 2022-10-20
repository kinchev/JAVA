import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Solve{
    private static boolean setAllStatus=false;
    private static HashMap<Integer,Integer>hashMap=new HashMap<>();
    private static int[] array=new int[]{5, 6, 78, 3, 90, 22, 34, 5};
    private static int setAllValue=0;

    private static void set(int index,int value){
        if(setAllStatus){
            hashMap.put(index,value);
        }
        array[index]=value;
    }
    private static int get(int index){
        if(setAllStatus){
            return hashMap.get(index)==null ? setAllValue :hashMap.get(index);
        }else{
            return array[index];
        }
    }

    private static void setAll(int value){
        setAllStatus=true;
        hashMap=new HashMap<Integer,Integer>();
        setAllValue=value;
    }

     

    
    
    public static void main(String[] args) {
        set(0, 30);
        System.out.println(get(0));
        System.out.println(get(1));
        setAll(30);
        set(1, 44);
        System.out.println(get(0));
        System.out.println(get(1));
        hashMap.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() +" " + entry.getValue());
        });
        System.out.println(Arrays.toString(array));
    }
}