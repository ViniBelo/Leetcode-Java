package model;

public class Solution {
//    First try
//    public int maxDepth(TreeNode root) {
//        return dfs(root, 0);
//    }
//
//    private int dfs(TreeNode node, int sum) {
//        if (node != null) {
//            sum++;
//            int left = dfs(node.left, sum);
//            int right = dfs(node.right, sum);
//            sum = Math.max(left, right);
//        }
//        return sum;
//    }

//    Second try
    public int maxDepth(TreeNode root) {
        return counterDfs(root, 0);
    }

    private int counterDfs(TreeNode current, Integer depth) {
        if (current == null) {
            return depth;
        }
        return Math.max(counterDfs(current.left, depth + 1),
                counterDfs(current.right, depth + 1));
    }
}
