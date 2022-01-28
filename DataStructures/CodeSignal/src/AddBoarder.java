import java.util.Arrays;

public class AddBoarder {
    public static String[] solution(String[] picture) {
        int upAndDown=picture[0].length()+2;
        int length=picture.length+2;
        int k=0;
        String[] newArray=new String[length];
        for (int i = 0; i < length; i++) {
            if(i==0){
                newArray[i]="*".repeat(upAndDown);

            }else if(i==length-1){
                newArray[i]="*".repeat(upAndDown);
            }else{
                newArray[i]="*"+picture[k]+"*";
                k++;
            }
        }

        return newArray;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"abv","ded"})));
    }
}
