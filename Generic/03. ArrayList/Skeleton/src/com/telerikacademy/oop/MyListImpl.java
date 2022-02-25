package com.telerikacademy.oop;

import java.util.Iterator;

public class MyListImpl<T> implements MyList<T> {
    private T[] items;
    private int size;
    private final static int INITIAL_CAPACITY = 8;

    public MyListImpl() {
        this.items = (T[]) new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return items.length;
    }

    @Override
    public void add(T element) {
        ensureCapacity();
        items[size++] = element;
    }

    private void ensureCapacity() {
        if (size == items.length) {
            T[] newItems = (T[]) new Object[items.length * 2 + 1];
            for (int i = 0; i < size(); i++) {
                newItems[i] = items[i];


            }
            items = newItems;
        }
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return items[index];

    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < size(); i++) {
            if (items[i].equals(element)) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public int lastIndexOf(T element) {

        for (int i = size() - 1; i > -1; i--) {
            if (items[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

    @Override
    public void removeAt(int index) {
        checkIndex(index);
        items[index] = null;
        size--;
        ensureCapacity();

    }

    private void checkIndex(int index) {
        if (0 > index || index >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public boolean remove(T element) {
        for (int i = 0; i < size(); i++) {
            if (items[i].equals(element)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public void clear() {
        T[] items = (T[]) new Object[INITIAL_CAPACITY];
        this.size = 0;

    }

    @Override
    public void swap(int from, int to) {

        T element = items[from];
        items[from] = items[to];
        items[to] = element;


    }

    @Override
    public void print() {
        for (T item : items) {
            System.out.println(item);

        }
    }
    
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size();
            }

            @Override
            public T next() {
                T element = items[index++];
                return element;
            }
        };
    }

    public static void main(String[] args) {
        MyList<Integer> a = new MyListImpl<>();
        a.add(1);
        a.add(11);
        a.add(111);
        a.add(1111);


        a.swap(0, 2);
        a.print();


    }


}
