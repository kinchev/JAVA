package String;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CapitalizeTitle2129 {
    public static String capitalizeTitle(String title) {
        String[] result=title.split(" ");
        for (int i = 0; i < result.length; i++) {
            if(result[i].length()<=2){
                result[i]=result[i].toLowerCase();
            }else{
                result[i]=result[i].substring(0, 1).toUpperCase() + result[i].substring(1).toLowerCase();
                
            }
        }
        return Arrays.stream(result).collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
        System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
    }
}
