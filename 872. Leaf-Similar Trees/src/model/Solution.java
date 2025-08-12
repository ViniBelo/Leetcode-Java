package model;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        var queue1 = new LinkedList<Integer>();
        recursiveFillQueue(root1, queue1);
        var queue2 = new LinkedList<Integer>();
        recursiveFillQueue(root2, queue2);
        return queue1.equals(queue2);
    }

    private void recursiveFillQueue(TreeNode root, Queue<Integer> queue) {
        if (root.left == null && root.right == null) queue.add(root.val);
        if (root.left != null) recursiveFillQueue(root.left, queue);
        if (root.right != null) recursiveFillQueue(root.right, queue);
    }
}
