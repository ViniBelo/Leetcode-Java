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
//    public int maxDepth(TreeNode root) {
//        return counterDfs(root, 0);
//    }
//
//    private int counterDfs(TreeNode current, Integer depth) {
//        if (current == null) {
//            return depth;
//        }
//        return Math.max(counterDfs(current.left, depth + 1),
//                counterDfs(current.right, depth + 1));
//    }

//    Third try
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return recursiveDFS(root, 1);
    }

    public int recursiveDFS(TreeNode root, int max) {
        if (root.left == null && root.right == null) return max;
        var left = 0;
        var right = 0;
        if (root.left != null) {
            left = Math.max(max, recursiveDFS(root.left, max + 1));
        }
        if (root.right != null) {
            right = Math.max(max, recursiveDFS(root.right, max + 1));
        }
        return Math.max(left, right);
    }
}
