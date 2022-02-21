package com.company.demo.OOP;

public class Child2 extends Parent {
    private String address;

    public Child2(String name, int age,String address) {
        super(name, age);
        this.address =address;
    }


    @Override
    public String toString() {
        return this.getName()+ "" +super.getAge()+address;
    }
}
