package String;


public class ReserveString {
  public static String reverse(String s){
        String [] array=new String[10];
        array=s.split(".");
        String result="";
        for (int i =  array.length-1; i >= 0; i--) {
          result+=array[i];
        }

        return result;
  }
  
    public static void main(String[] args) {
    System.out.println(reverse("I.love.programming"));
  }
}
