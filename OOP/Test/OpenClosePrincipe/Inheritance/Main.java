package Inheritance;

public class Main {
    public static void main(String[] args) {
        // B a=new C("Heloo");
        
        // B a1=new C();
        // // A a1=new C("Heloo");
    //    A obj=new C();
    //    ((B)obj).test();
        // A a=new A();
        // a.test();
        // A a=new B();
        A po = new B();
        po.foo(); // BASE_FOO_CALL
        po.bar();
     
    }
    
}
