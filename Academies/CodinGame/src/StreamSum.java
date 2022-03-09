import java.util.stream.IntStream;

public class StreamSum {
    public static void main(String[] args) {
        int n=4;
        System.out.println(IntStream.rangeClosed(2,n).filter(x->x%2==0).sum());
    }

}
