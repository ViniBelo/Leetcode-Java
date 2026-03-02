package model;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return dfs(root, targetSum, root.val);
    }

    private boolean dfs(TreeNode root, int targetSum, int sum) {
        if (root.left == null && root.right == null) return targetSum == sum;
        boolean left = false;
        boolean right = false;
        if (root.left != null) {
            left = dfs(root.left, targetSum, sum + root.left.val);
        }
        if (root.right != null) {
            right = dfs(root.right, targetSum, sum + root.right.val);
        }
        return left || right;
    }
}

