package String;

public class CountingValley {
    public static int countingValleys(int steps, String path) {
        int level=0;
        int downToValley=0;
        for(int i=0;i<steps;i++){
            if(path.charAt(i)=='U'){
                level++;
            }else{
                if(level==0){
                    downToValley--;
                }
                level--;
            }
        }
        return Math.abs(downToValley);

    }
    public static void main(String[] args) {

    }
}
