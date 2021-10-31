/*Given the root of a binary tree, return the length of the longest path,
 where each node in the path has the same value. This path may or may not pass through the root.

The length of the path between two nodes is represented by the number of edges between them.
Input: root = [1,4,5,4,4,5]
Output: 2
                         1
                        / \
                       4   5
                      / \   \
                     4   4   5

*/

public class LongestUnivaluePath {
    public static int max;


    public static int longestUnivaluePath(TreeNodeLeetCode root) {
        max = 0;
        longestPath(root);
        return max;
    }

    public static int longestPath(TreeNodeLeetCode node) {
        // Base case: if null node, return 0
        if (node == null) {
            return 0;
        }
        // Get the max length from left and right
        int maxLeft = longestPath(node.left);
        int maxRight = longestPath(node.right);
        // Calculate the current max length
        int maxLeftSoFar = 0;
        int maxRightSoFar = 0;
        // Compare parent node with child node
        // If they are the same, extend the max length by one
        if (node.left != null && node.left.val == node.val) {
            maxLeftSoFar = maxLeft + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            maxRightSoFar = maxRight + 1;
        }
        // Update the max with the sum of left and right length
        max = Math.max(max, maxLeftSoFar + maxRightSoFar);
        // Return the max from left and right to upper node
        // since only one side path is valid
        return Math.max(maxLeftSoFar, maxRightSoFar);
    }
}

