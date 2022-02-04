import java.util.ArrayList;

public class ArrayListSum {



    public static int getTotal(ArrayList<Integer> arr) {

        if(arr.size()==0){
            return 0;
        }

        return arr.remove(0)+getTotal(arr);


    }

    public static void main(String[] args) {
        ArrayList<Integer> myArrayLs = new ArrayList<Integer>();
        myArrayLs.add(3);
        myArrayLs.add(5);
        myArrayLs.add(6);
        myArrayLs.add(9);

        int total = getTotal(myArrayLs);
        System.out.println(total);
    }
}


