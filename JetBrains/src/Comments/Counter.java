package Comments;

public class Counter {
   public  int current=10;
    public int inc(){
        return this.current + 1;
    }
    int getCurrent(){
        return this.current;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.inc());
        System.out.println(counter.getCurrent());
    }
}
