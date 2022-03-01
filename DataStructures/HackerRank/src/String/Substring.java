package String;

import java.util.Scanner;

public class Substring {
    public static String substring(String input,int start,int end){
        return input.substring(start,end);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int start =scanner.nextInt();
        int end =scanner.nextInt();
        System.out.println(substring(input,start,end));

    }
}
