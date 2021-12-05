/*Given the root of a Binary Search Tree (BST),
 return the minimum absolute difference between the values of any two different nodes in the tree.

 Input: root = [4,2,6,1,3]
 Output: 1

 Input: root = [1,0,48,null,null,12,49]
 Output: 1

 */


import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBST {


    public static void inOrder(TreeNodeLeetCode node, List<Integer> values) {
        if (node == null) {
            return;
        } else {
            inOrder(node.left, values);
            values.add(node.val);
            inOrder(node.right, values);
        }
    }

    public static int getMinimumDifference(TreeNodeLeetCode node) {
        List<Integer> values = new ArrayList<>();
        inOrder(node, values);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < values.size() - 1; i++) {
            int current = Math.abs(values.get(i + 1) - values.get(i));
            min = Math.min(min, current);


        }

        return min;
    }
}

