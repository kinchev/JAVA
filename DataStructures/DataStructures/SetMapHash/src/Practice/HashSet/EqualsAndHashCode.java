package Practice.HashSet;

import java.util.HashSet;
import java.util.Objects;

public class EqualsAndHashCode {
    public static void main(String[] args) {
        EqualsAndHashCode one = new EqualsAndHashCode();
        EqualsAndHashCode two = new EqualsAndHashCode();
        one.name="Az";
        two.name = "Az";
        one.age=7;
        two.age=7;
        HashSet<EqualsAndHashCode> setOf = new HashSet<>();
        setOf.add(one);
        setOf.add(two);
        System.out.println(setOf.size());
        for (EqualsAndHashCode hashSetTest : setOf) {
            System.out.println(hashSetTest.toString());

        }
    }

    public String name;
    int age;

    public EqualsAndHashCode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public EqualsAndHashCode() {
    }

    @Override
    public String toString() {
        return this.name +  " " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsAndHashCode equalsAndHashCode = (EqualsAndHashCode) o;
        return age == equalsAndHashCode.age && Objects.equals(name, equalsAndHashCode.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}



