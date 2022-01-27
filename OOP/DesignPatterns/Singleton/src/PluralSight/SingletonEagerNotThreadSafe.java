package PluralSight;

public class SingletonEagerNotThreadSafe {

    private static final SingletonEagerNotThreadSafe instance = new SingletonEagerNotThreadSafe();

    private SingletonEagerNotThreadSafe() {

    }

    public static SingletonEagerNotThreadSafe getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonEagerNotThreadSafe instance = SingletonEagerNotThreadSafe.getInstance();
        System.out.println(instance);
        SingletonEagerNotThreadSafe anotherInstance = SingletonEagerNotThreadSafe.getInstance();
        System.out.println(anotherInstance);
    }
}
