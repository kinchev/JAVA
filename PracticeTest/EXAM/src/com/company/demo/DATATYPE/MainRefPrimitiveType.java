package com.company.demo.DATATYPE;

import com.company.demo.OOP.Person;

public class MainRefPrimitiveType {
    public static void main(String[] args) {
        int n=5;
        Person person = new Person("Ivan");
        method(n,person);
        System.out.println(n);
        System.out.println(person.getName());

    }
        public static void method(int n,Person person){
            n=2;
            person.setName("Gosho");
            person=new Person("Misho");
            person.setName("Tisho");
        }
}
