package model;

public class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val, 0);
    }

    private int dfs(TreeNode root, int max, int sum) {
        if (root == null) return sum;
        if (root.val >= max) {
            sum++;
            max = root.val;
        }
        sum = dfs(root.left, max, sum);
        sum = dfs(root.right, max, sum);
        return sum;
    }
}
