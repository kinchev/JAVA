
/*
      the tree:
         8
        / \
       66  5
          / \
         3   9

       */




package BreadthFirstSearch;
import java.util.LinkedList;
import java.util.Queue;

 class BinaryTreeNode<T> {

    T value;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T value) {
        this.value = value;
    }

    public BinaryTreeNode(T value, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }





    public void bfs() {
        Queue<BinaryTreeNode<T>> queue = new LinkedList<>();
        queue.offer(this);
        while (!queue.isEmpty()) {
            BinaryTreeNode<T> current = queue.poll();
            System.out.print(current.value + " ");
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }
}