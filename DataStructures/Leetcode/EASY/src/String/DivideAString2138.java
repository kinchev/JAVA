package String;

public class DivideAString2138 {
    public static String[] divideString(String s, int k, char fill) {
        String[] result=s.split("(?<=\\G.{" + k + "})");
        for (int index = 0; index < result.length; index++) {
            if(result[index].length()!=k){
                result[index]=result[index]+(String.valueOf(fill).repeat(k-result[index].length()));
            }
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(divideString("ctoyjrwtngqwt",8,'n'));
    }
}
