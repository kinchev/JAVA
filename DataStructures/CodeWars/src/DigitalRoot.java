public class DigitalRoot {

    public static void main(String[] args) {
        System.out.println(digital_root(9142));
    }
    public static int digital_root(int n) {
      int result=0;
        if(n<10){
            return n;
        }else{
            int digit=n%10;
            result+=digit;

             return result+ digital_root(n/10);
        }
    }
}
