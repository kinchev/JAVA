import java.util.Arrays;

public class MakeArrayConsecutive2 {
    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        System.out.println(solution(statues));
    }



        static int solution(int[] statues) {
            Arrays.sort(statues);
            int numsNeeded =0;
            for(int i=1;i <statues.length;i++){
                int different=statues[i]-statues[i-1];
                if(different>1){
                    numsNeeded+=different-1;
                }
            }
            return numsNeeded;
        }

    }

