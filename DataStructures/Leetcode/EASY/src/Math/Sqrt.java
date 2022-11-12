package Math;

public class Sqrt {
    public static int mySqrt(int x) {
     int y=1;
      while(y*y<=x){
        ++y;
      }
    return y-1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(120));
    }
    
}
