package LinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements List<T> {
    private Node head;
    private Node tail;
    private int size=0;

    
    
    public LinkedList(){
        head=tail=null;
    }


    private class Node {
        T value;
        Node prev;
        Node next;
    
        Node(T value) {
            this.value = value;
            prev=null;
            next=null;
        }
    }

    public LinkedList(Iterable<T> iterable){
        iterable.forEach(this::addLast);
    }
    @Override
    public Iterator<T> iterator() {
        return new IteratorImpl();
    }
    
    
    
    
    private class IteratorImpl implements Iterator<T> {
        private Node current=head;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if(!hasNext()){

                throw new NoSuchElementException();
            }
            T result=current.value;
            current=current.next;
            return result;
        }
        
        
        
    }
    
    
    @Override
    public void addFirst(T value) {
        Node toAdd=new Node(value);
        if(size()==0){
            addElementIfIsEmpty(toAdd);
            return;
        }
        connectLeftAdnRightNode(toAdd,head);
        head=toAdd;
        size++;


    }

    private void connectLeftAdnRightNode(Node left,Node right) {
        left.next=right;
        right.prev=left;

    }

    private void addElementIfIsEmpty(Node toAdd) {
        head=tail=toAdd;
        size++;
    }

    @Override
    public void addLast(T value) {

    }
    @Override
    public void add(int index, T value) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public T getFirst() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public T getLast() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public int indexOf(T value) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public T removeFirst() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public T removeLast() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

}
