public class Main {
    public static void main(String[] args) {
        CustomArrayList<String> myCustomArray=new CustomArrayList<>();

        myCustomArray.add("TEST 1");
        myCustomArray.add("TEST 2");
        myCustomArray.add("TEST 3");

        for (String s : myCustomArray) {
            System.out.println(s);
        }
    }
}
