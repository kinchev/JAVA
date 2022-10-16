package String;

public  class ReverseString2 {
    public static String reverseStr(String s, int k) {
        char[] array=s.toCharArray();
        for (int i = 0; i < array.length; i+=(2*k)) {
            int start=i;
            int end=Math.min(i+k-1,s.length()-1);
            while(start<end){
                char temp=array[start];
                array[start++]=array[end];
                array[end--]=temp;

               

            }
        }
        return new String(array);
    }
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }
}
