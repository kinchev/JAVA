package com.telerikacademy.dsa.queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue<E> implements Queue<E> {
    private E[] items;
    private int head, tail, size;
    private final static int INITIAL_CAPACITY = 8;

    public ArrayQueue() {
        items = (E[]) new Object[INITIAL_CAPACITY];
        head = tail = size = 0;
    }

    @Override
    public void enqueue(E element) {
        if (size() == items.length) {
            resize();
        }
        items[tail++] = element;
        size++;
    }

    private void resize() {
        if(items.length==size())

        items = Arrays.copyOf(items, items.length * 2 + 1);
        }


    @Override
    public E dequeue() {
        throwIfEmpty();
        return items[head];


    }

    private void throwIfEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }


    @Override
    public E peek() {
        return items[head];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    public static void main(String[] args) {
        Queue<Integer> a=new ArrayQueue<>();
        a.enqueue(1);
        a.enqueue(22);
        a.enqueue(333);
        a.enqueue(4444);
        a.enqueue(55555);
        a.enqueue(666666);
        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
        System.out.println(a);
    }
}
