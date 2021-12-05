package com.telerikacademy.dsa.queue;

import com.telerikacademy.dsa.Node;

public class LinkedQueue<E> implements Queue<E> {
    private Node<E> head, tail;
    private int size;

    @Override
    public void enqueue(E element) {

    }


    @Override
    public E dequeue() {
        E value = head.data;
        head = head.next;
        size--;
        return value;
    }

    @Override
    public E peek() {
        return head.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
