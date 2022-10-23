package Test1;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        A vqa = new A(10);
    
        B vqb = new B(20, 10);

        vqa = vqb;
        System.out.println(vqa.x + " " + vqb.y);
    }

}
