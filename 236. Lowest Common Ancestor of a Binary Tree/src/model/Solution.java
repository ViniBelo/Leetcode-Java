package model;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root, List.of(p, q), null);
    }

    private TreeNode dfs(TreeNode root, List<TreeNode> targets, TreeNode ancestor) {
        if (root == null) return null;
        if (ancestor != null) return ancestor;
        TreeNode left = null;
        TreeNode right = null;
        if (root.left != null)
            left = dfs(root.left, targets, null);
        if (root.right != null)
            right = dfs(root.right, targets, null);
        if (targets.contains(root)) {
            if ((left != null && left != root) || (right != null && right != root)) {
                ancestor = root;
                return ancestor;
            }
            return root;
        }
        if (left != null && right != null) return root;
        if (left != null) return left;
        return right;
    }
}

