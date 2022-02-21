package com.company.demo.DATATYPE;

import java.util.Objects;

public class EqualsObj {
    public static void main(String[] args) {
        A a=new A("QQQ");
        A b=new A("QQQ");
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
class A{
    String name;

    public A(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return Objects.equals(name, a.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
