import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.Collectors;

public class Test {
    static void increment(int index) {
        index++;
    }
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<Integer>();
        a.push(1);
        a.push(2);
        System.out.println(a.pop());
        a.push(1);
        a.push(2);
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        a.push(2);
        System.out.println(a.pop());


        ArrayList<String> arrayListObject = new ArrayList<>();
        arrayListObject.add("B");
        arrayListObject.add("D");
        arrayListObject.add("A");
        arrayListObject.add("C");
        arrayListObject = (ArrayList<String>) arrayListObject.stream().sorted().collect(Collectors.toList());

        int i = 0;
        increment(i);
        i++;
        System.out.println(i);
    }
}