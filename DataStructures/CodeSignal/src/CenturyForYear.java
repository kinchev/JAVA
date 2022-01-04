public class CenturyForYear {
    public static void main(String[] args) {

    }
    int solution(int year) {
        if(year<101){
            return 1;
        }else if (year%10==0){
            return year/100;
        }else{
            return year/100+1;
        }

    }
}
