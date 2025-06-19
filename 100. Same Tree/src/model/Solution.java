package model;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return _isSameTree(p, q);
    }

    private boolean _isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q != null || p != null && q == null) return false;
        if (p != null) {
            if (p.val != q.val) {
                return false;
            }
            return _isSameTree(p.left, q.left) && _isSameTree(p.right, q.right);
        }
        return true;
    }
}
