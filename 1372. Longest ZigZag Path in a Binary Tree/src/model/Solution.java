package model;

public class Solution {
    public int longestZigZag(TreeNode root) {
        return dfs(root, 0, NodeDirection.ROOT);
    }

    private int dfs(TreeNode root, int max, NodeDirection direction) {
        if (root.left == null && root.right == null) return max;

        var left = 0;
        var right = 0;
        if (direction == NodeDirection.ROOT) {
            if (root.left != null)
                left = dfs(root.left, max + 1, NodeDirection.LEFT);

            if (root.right != null)
                right = dfs(root.right, max + 1, NodeDirection.RIGHT);
        }
        else if (direction == NodeDirection.RIGHT) {
            if (root.left != null)
                left = dfs(root.left, max + 1, NodeDirection.LEFT);

            if (root.right != null)
                right = dfs(root.right, 1, NodeDirection.RIGHT);
        } else {
            if (root.right != null)
                left = dfs(root.right, max + 1, NodeDirection.RIGHT);

            if (root.left != null)
                right = dfs(root.left, 1, NodeDirection.LEFT);
        }
        int maxBetweenDirections = Math.max(left, right);
        return Math.max(max, maxBetweenDirections);
    }
}

