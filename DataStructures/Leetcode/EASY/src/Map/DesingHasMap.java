package Map;

import java.util.Arrays;

public class DesingHasMap {

    int[] data;

    public DesingHasMap() {
        data = new int[10];
        Arrays.fill(data, -1);
    }

    public void put(int key, int val) {
        data[key] = val;
    }

    public int get(int key) {
        return data[key];
    }

    public void remove(int key) {
        data[key] = -1;
    }
    public String toString(){
        return Arrays.toString(data );
    }

    public static void main(String[] args) {
        DesingHasMap a=new DesingHasMap();
        a.put(1,5);
        a.put(2,10);
        a.put(3,20);
        a.put(4,50);
        int x=a.get(1);
        a.remove(1);
         System.out.println(a);
    }
}
