//package CodeJam2022Round1;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ThreeDPrinting {
//    public static int[] D(int[] printerOne, int[] printerTwo, int[] printerThree) {
//            if(printerOne[0]>=printerTwo[0] && printerOne[0]>=printerThree[0]){
//
//            }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int testCases = Integer.parseInt(scanner.nextLine());
//        for (int i = 1; i <= testCases; i++) {
//            int[] printerOne = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//            int[] printerTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//            int[] printerThree = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//            System.out.println("Case #" + i + " " + Arrays.toString(D(printerOne, printerTwo, printerThree)));
//
//
//        }
//    }
//}
