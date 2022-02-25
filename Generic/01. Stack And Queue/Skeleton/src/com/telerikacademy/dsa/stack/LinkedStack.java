package com.telerikacademy.dsa.stack;

import com.telerikacademy.dsa.Node;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements Stack<E> {
    private Node<E> top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    @Override
    public void push(E element) {
        Node<E> toAdd = new Node<>();
        toAdd.data = element;
        toAdd.next = top;
        top = toAdd;
        size++;
    }

    @Override
    public E pop() {
        throwIfEmpty();
        E value = top.data;
        top = top.next;
        size--;
        return value;
    }

    @Override
    public E peek() {
        throwIfEmpty();
        return top.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    private void throwIfEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }




    public static void main(String[] args) {
        LinkedStack<String> a = new LinkedStack<>();
        a.push("1");
        a.push("22");
        a.push("333");
        a.push("4444");
        a.push("55555");
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());

        System.out.println(a.toString());

    }


}
