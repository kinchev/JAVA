package First;

public class Test1 {
    public static void main(String[] args) {
        Fruit fruit = new Banana();
    }

}

class Fruit {
    public Fruit() {
        System.out.println("Fruit Constructor");
    }

    public static void whatAmI() {
        System.out.println("I`m a fruit");
    }
}

class Banana extends Fruit {
    public Banana() {
        System.out.println("Banana constructor");
    }

    public static void whatAmI() {
        System.out.println("I`m a banana");

    }
}
