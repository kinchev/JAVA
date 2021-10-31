package com.telerikacademy.dsa;

import java.util.*;

public class BinarySearchTreeImpl<E extends Comparable<E>> implements BinarySearchTree<E> {
    private E value;
    private BinarySearchTreeImpl<E> left;
    private BinarySearchTreeImpl<E> right;


    public BinarySearchTreeImpl(E value) {
        this.value = value;


    }

    public BinarySearchTreeImpl(E value, BinarySearchTreeImpl<E> left, BinarySearchTreeImpl<E> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    @Override
    public E getRootValue() {
        return value;
    }

    @Override
    public BinarySearchTree<E> getLeftTree() {
        return left;
    }

    @Override
    public BinarySearchTree<E> getRightTree() {
        return right;
    }

    @Override
    public void insert(E value) {

        BinarySearchTreeImpl<E> newTree = new BinarySearchTreeImpl<>(value);

        if (getRootValue().compareTo(value) > 0) {
            if (left == null) {
                this.left = newTree;

            } else {
                left.insert(value);
            }

        } else if (getRootValue().compareTo(value) < 0) {
            if (right == null) {
                this.right = newTree;
            } else {
                right.insert(value);
            }


        }
    }


    @Override
    public boolean search(E value) {


        if (value.compareTo(this.value) == 0) {
            return true;
        }
        if (value.compareTo(this.value) < 0 && left != null) {
            return left.search(value);
        }
        if (value.compareTo(this.value) > 0 && right != null) {
            return right.search(value);
        }
        return false;
    }


    @Override
    public List<E> inOrder() {
        List<E> list = new ArrayList<>();
        dfsInOrder(list);
        return list;
    }

    private void dfsInOrder(List<E> list) {
        Stack<BinarySearchTree<E>> stack = new Stack<>();
        BinarySearchTreeImpl<E> currentNode = this;
        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = (BinarySearchTreeImpl<E>) stack.pop();
            list.add(currentNode.value);
            currentNode = currentNode.right;
        }
    }

    @Override
    public List<E> postOrder() {
        List<E> list = new LinkedList<>();
        return postOrder(this, list);
    }

    private List<E> postOrder(BinarySearchTreeImpl<E> current, List<E> list) {
        if (current.left != null) postOrder(current.left, list);
        if (current.right != null) postOrder(current.right, list);
        list.add(current.value);
        return list;
    }

    @Override
    public List<E> preOrder() {
        List<E> list = new LinkedList<>();
        return preOrder(this, list);
    }


    private List<E> preOrder(BinarySearchTreeImpl<E> current, List<E> list) {
        list.add(current.value);
        if (current.left != null) preOrder(current.left, list);
        if (current.right != null) preOrder(current.right, list);
        return list;
    }
    @Override
    public List<E> bfs() {
        List<E> values = new LinkedList<>();
        Queue<BinarySearchTreeImpl<E>> queue = new LinkedList<>();
        queue.add(this);
        while (!queue.isEmpty()) {
            BinarySearchTreeImpl<E> next = queue.poll();
            values.add(next.value);
            if (next.left != null) {
                queue.add(next.left);
            }
            if (next.right != null) {
                queue.add(next.right);
            }
        }
        return values;
    }

    @Override
    public int height() {
        return heightOfNode(this);
    }

    private int heightOfNode(BinarySearchTreeImpl<E> node) {
        if (node == null) {
            return -1;
        }
        if (isLeaf(node)) {
            return 0;
        }

        return 1 + Math.max(heightOfNode(node.left), heightOfNode(node.right));
    }
    private boolean isLeaf(BinarySearchTreeImpl<E> node) {
        if (node == null) {
            return true;
        }
        return false;
    }
    // Advanced task: implement remove method. To test, uncomment the commented tests in BinaryTreeImplTests
//    @Override
//    public boolean remove(E value) {
//        throw new UnsupportedOperationException();
//    }
    private boolean isEmpty() {
        return getRootValue() == null;
    }


}
