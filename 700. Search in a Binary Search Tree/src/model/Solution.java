package model;

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        return recursiveBST(root, val);
    }

    private TreeNode recursiveBST(TreeNode node, Integer val) {
        if (node == null) return null;
        if (node.val == val) {
            return node;
        }
        var leftResponse = recursiveBST(node.left, val);
        if (leftResponse != null) return leftResponse;
        return recursiveBST(node.right, val);
    }
}
