package model;

public class BinaryTree {
    TreeNode root = null;

    public void insert(int val) {
        if (root == null) {
            root = new TreeNode(val);
        } else recursive_insert(root, val);
    }

    private void recursive_insert(TreeNode root, int val) {
        if (val < root.getVal()) {
            if (root.getLeft() != null) {
                recursive_insert(root.getLeft(), val);
            } else {
                root.setLeft(new TreeNode(val));
            }
        } else {
            if (root.getRight() != null) {
                recursive_insert(root.getRight(), val);
            } else {
                root.setRight(new TreeNode(val));
            }
        }
    }

    public boolean search(int val) {
        if (root.getVal() == val) {
            return true;
        } else return recursive_search(root, val);
    }

    private boolean recursive_search(TreeNode root, int val) {
        if (val == root.getVal()) {
            return true;
        }
        if (val < root.getVal()) {
            if (root.getLeft() != null) {
                return recursive_search(root.getLeft(), val);
            }
        } else {
            if (root.getRight() != null) {
                return recursive_search(root.getRight(), val);
            }
        }
        return false;
    }
}
