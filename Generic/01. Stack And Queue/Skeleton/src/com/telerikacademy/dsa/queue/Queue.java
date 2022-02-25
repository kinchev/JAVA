package com.telerikacademy.dsa.queue;

public interface Queue<E> {

    void enqueue(E element);

    E dequeue();

    E peek();

    int size();

    boolean isEmpty();

}
