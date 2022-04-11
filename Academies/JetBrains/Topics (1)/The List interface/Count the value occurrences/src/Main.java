import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int a = (int) list1.stream().filter(x -> x.equals(elem)).count();
        int b = (int) list2.stream().filter(x -> x.equals(elem)).count();
        return a == b;

    }
}