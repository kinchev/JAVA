package lesson2;
import lesoon3.Name;

public class Person {
    private  Name personName;
    public static int  count=0;

    public Person(){/*
    Empty on purpose -detault constructor
    
    */
        count++; 
            }
    
    public Person(Name personName){
        this.personName=personName;

    }
    
    public String helloWorld() {
        return "Hello World";
    }
    public String sayHello(String personName){
        return "Hello "+ personName;
    }

}
