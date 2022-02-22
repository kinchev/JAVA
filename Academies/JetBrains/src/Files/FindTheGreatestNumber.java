package Files;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindTheGreatestNumber {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<Integer>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("dataset_91033.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(Integer.parseInt(reader.readLine()));


            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//
//      File file=new File("dataset_91007.txt");
//        Scanner scanner = new Scanner(file);
//        List<Integer> list = new ArrayList<>();
//        while (scanner.hasNext()) {
//            if (scanner.hasNextInt()) {
//                list.add(scanner.nextInt());
//            } else {
//                scanner.next();
//            }
//        }

        System.out.println(Collections.max(list));
    }
}
