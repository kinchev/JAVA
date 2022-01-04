//public class AlmostIncreasingSequence {
//    public static void main(String[] args) {
//        int[] statues = {1, 3, 2, 1};
//        System.out.println(solution(statues));
//    }
//
//    static boolean solution(int[] sequence) {
//        int remove = 0;
//        for (int i = 1; i < sequence.length; i++) {
//            if (sequence[i] <= sequence[i - 1]) {
//                remove++;
//            }
//    }
//            if (remove > 1) {
//                return false;
//        }
//
//
//            return true;
//
//}