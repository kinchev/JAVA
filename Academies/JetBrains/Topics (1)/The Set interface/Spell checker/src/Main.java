import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Set<String> input = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
         while(scanner.hasNext() && n>0){
             input.add(scanner.nextLine().toLowerCase());
             n--;
         }
        int nRow=scanner.nextInt();
       Stream.of(scanner.nextLine().toLowerCase()).filter(input::contains).collect(Collectors.toList());


    }
}