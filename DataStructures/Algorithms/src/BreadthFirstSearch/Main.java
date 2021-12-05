package BreadthFirstSearch;




import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        the tree:
           8
          / \
         66  5
            / \
           3   9

         */
        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> anotherNode = new TreeNode<>(2,
                List.of(new TreeNode<>(null), new TreeNode<>(5)));
        root.children = List.of( anotherNode,new TreeNode<>(3));


        root.bfs();
        root.dfs();

    }
}
