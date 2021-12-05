public class TreeNodeLeetCode {
    public static void main(String[] args) {
        TreeNodeLeetCode n = new TreeNodeLeetCode(1, new TreeNodeLeetCode(4, new TreeNodeLeetCode(4), new TreeNodeLeetCode(4)), new TreeNodeLeetCode(5, null, new TreeNodeLeetCode(5)));
//        System.out.println(MinimumAbsoluteDifferenceInBST.getMinimumDifference(n));
        System.out.println(LongestUnivaluePath.longestUnivaluePath(n));
    }


    public int val;
    public TreeNodeLeetCode left;
    public TreeNodeLeetCode right;

    public TreeNodeLeetCode() {
    }


    public TreeNodeLeetCode(int val) {
        this.val = val;
    }

    public TreeNodeLeetCode(int val, TreeNodeLeetCode left, TreeNodeLeetCode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}