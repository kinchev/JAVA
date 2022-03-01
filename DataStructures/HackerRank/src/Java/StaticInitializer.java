package Java;

import java.util.Scanner;

public class StaticInitializer {
    static int  result(int base, int height) throws Exception {
        if(base>0 && height >0) {
            return base * height;
        }else{
           throw new Exception("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int breadth = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        try {

                System.out.println(result(breadth, height));

        } catch (Exception e) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
}
