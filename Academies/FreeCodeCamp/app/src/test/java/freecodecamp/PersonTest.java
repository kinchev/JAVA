package freecodecamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import lesson2.Person;
public class PersonTest {

    @Test
    public void shouldReturnHelloWorld(){
        Person kvk=new Person();
        assertEquals("Hello World",kvk.helloWorld());
    }

    @Test
    public void shouldReturnHelloName(){
        Person qka=new Person();
        assertEquals("Hello Qka",qka.sayHello("Qka"));

    }
    @Test
    public void shouldReturnNumberOfPersons(){
        Person mani=new Person();
        Person qka=new Person();
        Person sintiq=new Person();
        assertEquals(3,Person.count );
        
    }
}
