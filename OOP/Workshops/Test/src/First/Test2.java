package First;

public class Test2 {
    public static void main(String[] args) {

    }
}
class Foo{
    public Foo(){
        doSomething();

    }
    public void doSomething(){
        System.out.println("Do something important");
    }
}
class Bar extends Foo{
    @Override
    public void doSomething() {
        System.out.println("YOLO!");
        Zoom zoom = new Zoom(this);
    }
}
class Zoom extends Foo{
    public Zoom(Bar bar){

    }

}