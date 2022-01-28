import java.util.Arrays;
import java.util.stream.IntStream;

public class AlternatingSums {
    public static int[] solution(int[] a){
        int sum1= IntStream.range(0,a.length).filter(i->i %2==0).mapToObj(i->a[i]).mapToInt(i->i).sum();
        int sum2= IntStream.range(0,a.length).filter(i->i %2!=0).mapToObj(i->a[i]).mapToInt(i->i).sum();

        return new int[]{sum1,sum2};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{50,60,60,45,70})));
    }
}
