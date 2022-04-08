package List;

import java.util.stream.IntStream;

public class StairCase {
    public static void staircase(int n) {
        int countSymbol=1;
        String symbol="#";
        for (int i = n; i > 0; i--) {
            IntStream.range(0,i-1).forEach(a-> System.out.print(" "));

            IntStream.range(0,countSymbol).forEach(a-> System.out.print(symbol));
            countSymbol += 1;
            if(i==1) {
                break;
            }else{
                System.out.println();

            }

        }

    }

    public static void main(String[] args) {
        staircase(6);
    }
}
