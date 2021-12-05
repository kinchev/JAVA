package TEST;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetTest {
    public String name;
    int age;

    public HashSetTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public HashSetTest() {
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
    @Override
    public String toString() {
        return this.name;
    }
}

    class Test {
        public static void main(String[] args) {
            HashSetTest one = new HashSetTest();
            HashSetTest two = new HashSetTest();
            one.name = "Az";
            two.name = "Ti";
            HashSet<HashSetTest> setOf = new HashSet<>();
            setOf.add(one);
            setOf.add(two);
            System.out.println(setOf.size());
            for (HashSetTest hashSetTest : setOf) {
                System.out.println(hashSetTest.toString());

            }
            }
        }

class Test1{
    public static void main(String[] args) {
        HashSetTest three = new HashSetTest("John",20);
        HashSetTest four = new HashSetTest("John",20);
        HashSet<HashSetTest> setOf = new HashSet<>();
        setOf.add(three);
        setOf.add(four);
        System.out.println(setOf.size());
    }
}