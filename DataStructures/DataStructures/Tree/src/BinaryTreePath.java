/*Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
                                1
                               / \
                              2   3
                               \
                                5

*/


import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    public List<String> binaryTreePaths(TreeNodeLeetCode root) {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        String current_path = Integer.toString(root.val);
        if (root.left == null && root.right == null) {
            result.add(current_path);
        }
        if (root.left != null) {
            dfs(root.left, current_path, result);
        }if (root.right != null) {
            dfs(root.right, current_path, result);
        }


        return result;

    }

    public void dfs(TreeNodeLeetCode node, String current_path, List<String> result) {
        current_path += "->" + node.val;
        if(node.left ==null && node.right==null){
            result.add(current_path);
            return;
        }
        if (node.left != null) {
            dfs(node.left, current_path, result);
        }if (node.right != null) {
            dfs(node.right, current_path, result);
        }

    }

}
