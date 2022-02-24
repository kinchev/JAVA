package CrackingTheInterview;

import java.util.ArrayList;
import java.util.List;

public class DropTheConstants {

    public static void main(String[] args) {
        int [] array = new int[]{1,5,4,6,7,8,9,5};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int x : array) {
            if(x<min){
                min=x;
            }
            if(x>max){
                max=x;
            }

        }
        for (int x : array) {
            if(x<min){
                min=x;
            }

        }
        for (int x : array) {
            if(x>max){
                max=x;
            }

        }
        List<Integer>a=new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        System.out.println(a);
    }
}
