import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Person {
    String name;
    int age;
    Person parent;

    public Person(String name, int age, Person parent) {
        this.name = name;
        this.age = age;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Person getParent() {
        return parent;
    }

    public void setParent(Person parent) {
        this.parent = parent;
    }

    public static Person checkParentIsNull(Set<Person> persons) {
        Person findParent = persons.iterator().next();
        if (findParent.getParent() == null) {
            return findParent;
        }
        return checkParentIsNull(persons);

    }

    public static void main(String[] args) {
        Person person = new Person("a", 1, null);
        Person person1 = new Person("b", 2, person);
        Person person2 = new Person("c", 3, person1);
        Set<Person> persons = new HashSet<Person>();
        persons.add(person);
        persons.add(person1);
        persons.add(person2);
        System.out.println(checkParentIsNull(persons));

    }
}
