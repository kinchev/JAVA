package List;

import java.util.*;

public class BirthdayCake {

    public static int birthdayCakeCandles(List<Integer> candles) {
        List<Integer> candle = new ArrayList<>(candles);
        Collections.sort(candle);
        int count = 1;
        int n=1;
        while (true) {
            if (candle.get(candle.size() - n)==candle.get(candle.size() - (n + 1))&& n+1<candle.size()) {
                count += 1;

            } else {
                break;
            }
            n++;
        }
        return count;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<Integer> x=new ArrayList<>();
//        for (int i = 0; i < 100000; i++) {
//            x.add(scanner.nextInt());
//        }
        System.out.println(birthdayCakeCandles(List.of(4,4,1,3,4,4,1,2,3,2,3,4,3,6,7,8,9,6)));
    }
}
