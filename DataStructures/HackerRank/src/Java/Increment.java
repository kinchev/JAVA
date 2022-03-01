package Java;

import java.util.ArrayList;
import java.util.List;

public class Increment {

  static  void a() {
        int i = 5;  List<Integer> list = new ArrayList<>(80);
        add(i, list);
        System.out.println(list.size() * 2 + i);
    }
   static void add(int x, List<Integer> list) {
        list.add(++x);
       System.out.println(list.size()*2+x);
    }

    public static void main(String[] args) {
        a();
    }
}
