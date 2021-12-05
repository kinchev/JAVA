package com.telerikacademy.oop.tests.MyListImplTests;

import com.telerikacademy.oop.MyList;
import com.telerikacademy.oop.MyListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveTests {

    private MyList<Integer> myList;

    @BeforeEach
    public void before() {
        myList = new MyListImpl<>();
    }

    @Test
    public void remove_returns_true_when_successful() {
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        Assertions.assertTrue(myList.remove(3));
    }

    @Test
    public void remove_returns_false_when_unsuccessful() {
        myList.add(1);
        myList.add(2);
        myList.add(3);

        Assertions.assertFalse(myList.remove(4));
    }

}
