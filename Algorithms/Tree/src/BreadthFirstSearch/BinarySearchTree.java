package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BinarySearchTree<E> {
    private static final String VALUE_CANNOT_BE_NULL = "Value cannot be null." ;
    private E value;
    private final BinarySearchTree<E> left;
    private final BinarySearchTree<E> right;

    public BinarySearchTree(E value) {
        if (value == null) {
            throw new IllegalArgumentException(VALUE_CANNOT_BE_NULL);
        }
        this.value = value;
        left = null;
        right = null;
    }

    public E getRootValue() {
        return value;
    }


    public BinarySearchTree<E> getLeftTree() {
        return left;
    }


    public BinarySearchTree<E> getRightTree() {
        return right;
    }

    public List<E> bfs() {
        List<E> result = new ArrayList<>();
        Queue<BinarySearchTree<E>> queue = new LinkedList<>();
        queue.add(this);
        while (!queue.isEmpty()) {
            BinarySearchTree<E> nextNode = queue.poll();
            result.add(nextNode.getRootValue());
            if (nextNode.left != null) {
                queue.add(nextNode.left);
            }
            if (nextNode.right != null) {
                queue.add(nextNode.right);
            }
        }
        return  result;
    }



}
