package com.company.demo.DSA;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
//    @Override
//    public int hashCode() {
//        return 31;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return true;
//    }

    public static void main(String[] args) {
        java.util.Set<String> people=new HashSet<>();
        people.add(new String("Go"));
        people.add(new String("MI"));
        people.add(new String("TI"));
        people.add(new String("Go"));
        for (String person : people) {
            System.out.println(person);
        }


    }


}
