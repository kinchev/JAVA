package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

 class BinarySearchTree<E> {
    private static final String VALUE_CANNOT_BE_NULL = "Value cannot be null.";


    private E value;
    private BinarySearchTree<E> left;
    private BinarySearchTree<E> right;

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

    public List<E> inOrder() {
        List<E> result = new ArrayList<>();
        if (getLeftTree() != null) {
            result.addAll(getLeftTree().inOrder());
        }
        result.add(getRootValue());
        if (getRightTree() != null) {
            result.addAll(getRightTree().inOrder());
        }
        return result;
    }


    public List<E> postOrder() {
        List<E> result = new ArrayList<>();
        if (getLeftTree() != null) {
            result.addAll(getLeftTree().postOrder());
        }
        if (getRightTree() != null) {
            result.addAll(getRightTree().postOrder());
        }
        result.add(getRootValue());
        return result;
    }


    public List<E> preOrder() {
        List<E> result = new ArrayList<>();
        result.add(getRootValue());
        if (getLeftTree() != null) {
            result.addAll(getLeftTree().preOrder());
        }
        if (getRightTree() != null) {
            result.addAll(getRightTree().preOrder());
        }
        return result;
    }

}
