package model;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        return left != null && right != null &&
                left.val == right.val &&
                dfs(left.left, right.right) &&
                dfs(left.right, right.left);
    }
}

