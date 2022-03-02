import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        List a = new ArrayList();
        a.add("BBB");
        String name = (String) a.get(0);
        a.add(7);
        if(a.get(0) instanceof String){
            System.out.println("Str");
        }else{
            System.out.println("whatt is");
        }
        System.out.println(a);
    }
}
