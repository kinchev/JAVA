package PluralSight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonLazyThreadSafe {
    private static volatile SingletonLazyThreadSafe instance = null;


    private SingletonLazyThreadSafe() {


        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }

    }

    public static SingletonLazyThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyThreadSafe.class) {
                if (instance == null) {

                    instance = new SingletonLazyThreadSafe();

                }
            }
        }

        return instance;
    }


    public static void main(String[] args) {
        SingletonLazyThreadSafe instance = SingletonLazyThreadSafe.getInstance();
        System.out.println(instance);
        SingletonLazyThreadSafe anotherInstance = SingletonLazyThreadSafe.getInstance();
        System.out.println(anotherInstance);
    }
}
