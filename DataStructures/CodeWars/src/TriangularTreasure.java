public class TriangularTreasure {
    public static long triangular(long n) {
        return n>0 ?n*(n+1)/2 :0;
    }

    public static void main(String[] args) {
        System.out.println(triangular(770879986));
    }
}
