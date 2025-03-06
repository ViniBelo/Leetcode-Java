package model;

public class Solution {
    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int sum) {
        if (node != null) {
            sum++;
            int left = dfs(node.left, sum);
            int right = dfs(node.right, sum);
            sum = Math.max(left, right);
        }
        return sum;
    }
}
