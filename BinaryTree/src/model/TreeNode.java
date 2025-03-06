package model;

public class TreeNode {
    private TreeNode left;
    private TreeNode right;
    private final int val;

    TreeNode(int val) {
        left = right = null;
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
