package com.telerikacademy.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTreeImpl<E extends Comparable<E>> implements BinarySearchTree<E> {
    private static final String VALUE_CANNOT_BE_NULL = "Value cannot be null.";
    private static final String VALUE_IS_ALREADY_PRESENT = "Value is already present.";
    public static final String TREE_CANNOT_BE_EMPTY = "Tree cannot be empty.";

    private E value;
    private BinarySearchTreeImpl<E> left;
    private BinarySearchTreeImpl<E> right;

    public BinarySearchTreeImpl(E value) {
        if (value == null) {
            throw new IllegalArgumentException(VALUE_CANNOT_BE_NULL);
        }
        this.value = value;
        left = null;
        right = null;
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
        if (value == null) {
            throw new IllegalArgumentException(VALUE_CANNOT_BE_NULL);
        }
        BinarySearchTreeImpl<E> node = new BinarySearchTreeImpl<>(value);
        int compare = value.compareTo(this.value);
        if (compare < 0) {
            if (left == null) {
                left = node;
            } else {
                left.insert(value);
            }
        } else if (compare > 0) {
            if (right == null) {
                right = node;
            } else {
                right.insert(value);
            }
        } else {
            throw new IllegalArgumentException(VALUE_IS_ALREADY_PRESENT);
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

    @Override
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

    @Override
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

    @Override
    public List<E> bfs() {
        List<E> result = new ArrayList<>();
        Queue<BinarySearchTreeImpl<E>> queue = new LinkedList<>();
        queue.add(this);
        while (!queue.isEmpty()) {
            BinarySearchTreeImpl<E> nextNode = queue.poll();
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

    @Override
    public int height() {
        if (left == null && right == null) {
            return 0;
        }
        if (left == null) {
            return 1 + right.height();
        }
        if (right == null) {
            return 1 + left.height();
        }
        return Math.max(left.height(), right.height()) + 1;
    }

    @Override
    public boolean remove(E value) {
        if (value.compareTo(this.value) == 0 && left == null && right == null) {
            throw new IllegalArgumentException(TREE_CANNOT_BE_EMPTY);
        }
        return removeNodeRecursively(value, this);
    }

    private boolean removeNodeRecursively(E value, BinarySearchTreeImpl<E> parent) {
        if (value.compareTo(this.value) == 0) {
            if (isLeaf(this)) {
                removeLeaf(this, parent);
                return  true;
            }
            BinarySearchTreeImpl<E> nodeToRemove;
            if (left != null) {
                nodeToRemove = left.getMaxValueNode();
            } else {
                nodeToRemove = right.getMinValueNode();
            }
            BinarySearchTreeImpl<E> nodeToRemoveParent = getParent(nodeToRemove, this);
            E tempValue = nodeToRemove.value;
            nodeToRemoveParent.removeNodeRecursively(nodeToRemove.value, nodeToRemoveParent);
            this.value = tempValue;
            return true;

        } else if (value.compareTo(this.value) < 0 && left != null) {
            return left.removeNodeRecursively(value, this);
        } else if (value.compareTo(this.value) > 0 && right != null) {
            return right.removeNodeRecursively(value, this);
        } else {
            return false;
        }
    }

    private BinarySearchTreeImpl<E> getParent(BinarySearchTreeImpl<E> node, BinarySearchTreeImpl<E> root) {
        if (root.left == node || root.right == node) {
            return root;
        }
        if (node.value.compareTo(root.value) <= 0) {
            return getParent(node, root.left);
        }
        return getParent(node, root.right);
    }

    private BinarySearchTreeImpl<E> getMinValueNode() {
        if (left == null) {
            return this;
        }
        return left.getMinValueNode();
    }

    private BinarySearchTreeImpl<E> getMaxValueNode() {
        if (right == null) {
            return this;
        }
        return right.getMaxValueNode();
    }

    private void removeLeaf(BinarySearchTreeImpl<E> leaf, BinarySearchTreeImpl<E> parent) {
        if (parent.left != null && parent.left.getRootValue().compareTo(leaf.getRootValue()) == 0) {
            parent.left = null;
        } else {
            parent.right = null;
        }
    }

    private boolean isLeaf(BinarySearchTreeImpl<E> node) {
        return node.left == null && node.right == null;
    }
}
