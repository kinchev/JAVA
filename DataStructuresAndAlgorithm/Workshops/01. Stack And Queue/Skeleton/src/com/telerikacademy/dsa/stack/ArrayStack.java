package com.telerikacademy.dsa.stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayStack<E> implements Stack<E> {
    private E[] items;
    private int top;
    private static final int INITIAL_CAPACITY = 8;

    public ArrayStack() {
        this.items = (E[]) new Object[INITIAL_CAPACITY];
        this.top = 0;
    }

    @Override
    public void push(E element) {
        ensureCapacity();
        items[top++] = element;


    }

    private void ensureCapacity() {
        if (items.length == size()) {
            E[] newSize = (E[]) new Object[items.length * 2 + 1];
            for (int i = 0; i < size(); i++) {
                newSize[i] = items[i];
            }
            items = newSize;
        }
    }

    @Override
    public E pop() {
        throwIfEmpty();
        E el = items[top];
        items[top] = null;
        top--;
        return el;
    }

    @Override
    public E peek() {
        throwIfEmpty();
        return items[--top];
    }

    private void throwIfEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }


    @Override
    public int size() {
        return this.top;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    public void print() {
        for (E item : items) {
            System.out.println(item);

        }
    }

    public static void main(String[] args) {
        Stack<Integer> a = new ArrayStack<>();
        a.push(1);
        a.push(11);
        a.push(111);
        a.push(1111);


        System.out.println(a.peek());
        System.out.println(a.peek());
        System.out.println(a.peek());

    }
}
