/*    8
  66      5
        3   9

 */


import java.util.ArrayList;
import java.util.List;

public class Tree {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(8);
        TreeNode<Integer> anotherNode = new TreeNode<>(5, List.of(new TreeNode<>(3), new TreeNode<>(9)));
        root.children = List.of(new TreeNode<>(66), anotherNode);

        BinaryTreeNode<Integer> binaryTreeRoot = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> anotherBinaryNode = new BinaryTreeNode<>(5, new BinaryTreeNode<>(3), new BinaryTreeNode<>(9));
        binaryTreeRoot.left = new BinaryTreeNode<>(66);
        binaryTreeRoot.right = anotherBinaryNode;

        System.out.println();




    }

    public static class TreeNode<T> {

        T value;
        List<TreeNode<T>> children = new ArrayList<>();

        public TreeNode(T value) {
            this.value = value;
        }

        public TreeNode(T value, List<TreeNode<T>> children) {
            this.value = value;
            this.children = children;


        }
    }

    public static class BinaryTreeNode<T> {
        T value;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T value) {
            this.value = value;
        }

        public BinaryTreeNode(T value, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
}
