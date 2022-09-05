package freecodecamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

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
    @Test

    public void demostrateBoolean(){
        int i=4;
        int j=3;

        if(i>j){
            System.out.println("Cool");
        }else{
            System.out.println("Not cool");
        }
        assertEquals(, actual);

    }
}
