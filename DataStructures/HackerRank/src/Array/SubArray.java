package Array;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int count = 0;
        for (int j = 0; j < n; j++) {
            int sum=0;
            for (int k = j; k <n ; k++) {
                sum+=arr[k];
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
