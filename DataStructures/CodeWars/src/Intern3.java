import java.util.ArrayList;
import java.util.List;

public class Intern3 {
        public static List<Long> maxSubsetSum(List<Integer> k) {
            List<Long> sumList = new ArrayList<Long>();
            int kLength =k.size()-1;
            long sum=0;
            int index=0;
            while(kLength >=0) {
                for (int i = 1; i <= k.get(index); i++) {
                    int number=k.get(index);
                    if (number % i == 0) {
                        sum += i;
                    }
                }
                    sumList.add(sum);
                    index++;
                    kLength--;
                    sum=0;
            }
            return sumList;
        }
    public static void main(String[] args) {
        System.out.println(maxSubsetSum(List.of(2,4)));
    }
}
