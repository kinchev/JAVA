public class test {
    public static void main(String[] args) {
        int[] count = new int[255];
        count['a']++;
        System.out.println(count['a']);
        int counter=0;
        for(int i=0;i<count.length;i++) {
            System.out.println(counter++ + " " + count[i]);
        }
    }
}
