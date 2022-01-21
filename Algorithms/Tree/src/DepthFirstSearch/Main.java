package DepthFirstSearch;



        /*
        the tree:
           8
          / \
         66  5
            / \
           3   9

         */
public class Main {

    public static void main(String[] args) {

        BinaryTreeNode<Integer> binaryTreeRoot = new BinaryTreeNode<>(8);
        BinaryTreeNode<Integer> binaryTreeAnotherNode = new BinaryTreeNode<>(5,
                new BinaryTreeNode<>(3),
                new BinaryTreeNode<>(9));
        binaryTreeRoot.left = binaryTreeAnotherNode;
        binaryTreeRoot.right = new BinaryTreeNode<>(66);

//
//        binaryTreeRoot.bfs();
//        System.out.println();

        System.out.println("Preorder:");
        binaryTreeRoot.dfsPreOrder();
        System.out.println();
        System.out.println("~~~");

//        System.out.println("Postorder:");
//        binaryTreeRoot.dfsPostOrder();
//        System.out.println();
//        System.out.println("~~~");
//
//        System.out.println("Inorder:");
//        binaryTreeRoot.dfsInOrder();
   }
}
