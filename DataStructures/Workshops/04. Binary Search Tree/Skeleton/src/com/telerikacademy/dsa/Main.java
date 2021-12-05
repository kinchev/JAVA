package com.telerikacademy.dsa;

public class Main {
    
    public static void main(String[] args) {
    BinarySearchTreeImpl<Integer> tree=new BinarySearchTreeImpl<>(50);
    tree.insert(60);
    tree.insert(100);
    tree.insert(333);
    tree.insert(44);
    tree.insert(69);
    tree.search(69);
    tree.search(3);
    tree.search(3333);


    }
    
}
