package com.company.demo.DSA;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet2 {
    public static void main(String[] args) {
        Customer c1=new Customer("John",20);
        Customer c2=new Customer("John",20);
        Set<Customer> customerSet=new HashSet<Customer>();
        customerSet.add(c1);
        customerSet.add(c2);
        System.out.println(customerSet.size());
    }
}
class Customer{
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
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
}