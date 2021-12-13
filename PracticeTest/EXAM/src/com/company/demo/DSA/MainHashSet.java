package com.company.demo.DSA;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.name="John";
        employee2.name="Martin";
        HashSet<Employee> employeeSet=new HashSet<Employee>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        System.out.println(employeeSet.size());
        employeeSet.forEach(System.out::println);
    }
}
class Employee{
    public String name;

    @Override
    public boolean equals(Object o) {
      return true;
    }

    @Override
    public int hashCode() {
        return 31;
    }
}