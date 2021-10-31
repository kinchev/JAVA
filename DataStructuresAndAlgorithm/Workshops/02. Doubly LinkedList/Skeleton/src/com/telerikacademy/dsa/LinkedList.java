package com.telerikacademy.dsa;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements List<T> {
    private Node head;
    private Node tail;
    private int size = 0;

    public LinkedList() {
        head = tail = null;
    }

    public LinkedList(Iterable<T> iterable) {
        iterable.forEach(this::addLast);
    }

    @Override
    public void addFirst(T value) {
        Node newFirst = new Node(value);
        if (size() == 0) {
            addIfIsEmpty(newFirst);
            return;

        }
        nodeConnections(newFirst, head);
        head = newFirst;
        size++;

    }


    @Override
    public void addLast(T value) {
        Node newLast = new Node(value);
        if (size() == 0) {
            addIfIsEmpty(newLast);
            return;
        }
        nodeConnections(tail, newLast);
        tail = newLast;
        size++;
    }

    @Override
    public void add(int index, T value) {
        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size) {
            addLast(value);
            return;
        }
        Node previous = getIndexNode(index--);
        Node next = previous.next;
        Node toAdd = new Node(value);
        nodeConnections(previous, toAdd);
        nodeConnections(toAdd, next);
        size++;


    }


    @Override
    public T getFirst() {
        throwIfEmpty();
        return head.value;
    }


    @Override
    public T getLast() {
        throwIfEmpty();
        return tail.value;
    }

    @Override
    public T get(int index) {
        throwIfEmpty();
        return getIndexNode(index).value;
    }

    @Override
    public int indexOf(T value) {

        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == value) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    @Override
    public T removeFirst() {
        throwIfEmpty();
        if (size() == 1) {
            return removeElementIfSizeOne();
        }
        T value = head.value;

        head = head.next;
        head.previous = null;
        size--;
        return value;
    }


    @Override
    public T removeLast() {
        throwIfEmpty();
        if (size() == 1) {
            return removeElementIfSizeOne();
        }
        T value = tail.value;
        tail = tail.previous;
        tail.next = null;
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    private T removeElementIfSizeOne() {
        T value = head.value;
        head = tail = null;
        size--;
        return value;
    }

    private void throwIfEmpty() {
        if (size() == 0) {
            throw new NoSuchElementException("List is empty");
        }
    }

    private Node getIndexNode(int index) {
        throwIfInvalidIndex(index);
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        return temp;
    }

    private void throwIfInvalidIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new NoSuchElementException("Invalid index");

        }
    }

    private void addIfIsEmpty(Node node) {
        head = tail = node;
        size++;

    }

    private void nodeConnections(Node left, Node right) {
        left.next = right;
        right.previous = left;

    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator<T> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;

        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("There isn`t next element!");
            }
            T result = current.value;
            current = current.next;
            return result;
        }
    }

    private class Node {
        T value;
        Node previous;
        Node next;

        Node(T value) {
            this.value = value;
            this.previous = null;
            this.next = null;
        }

    }
}





