package First;

public class Test1 {
    public static void main(String[] args) {
        Banana banana = new Banana();
        Fruit fruit = banana;
    }

}

class Fruit {
    public Fruit() {
        System.out.println("First.Fruit Constructor");
    }

    public static void whatAmI() {
        System.out.println("I`m a fruit");
    }
}

class Banana extends Fruit {
    public Banana() {
        System.out.println("First.Banana constructor");
    }

    public static void whatAmI() {
        System.out.println("I`m a banana");

    }
}
