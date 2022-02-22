package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumNumberInFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("dataset_91033.txt");
        Scanner scanner = new Scanner(file);
        long sum=0;
        while(scanner.hasNext()){
            sum+=scanner.nextInt();

        }
        System.out.println(sum);
    }
}
