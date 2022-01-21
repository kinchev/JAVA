package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

 class TreeNode<T> {


    T value;
    public List<TreeNode<T>> children = new ArrayList<>();


    public TreeNode(T value) {
        this.value = value;

    }

    public TreeNode(T value, List<TreeNode<T>> children) {
        this.value = value;
        this.children = children;

    }


    public void dfs() {
        System.out.print(value + " ");
        for (TreeNode<T> child : children) {
            child.dfs();
        }

    }
}
