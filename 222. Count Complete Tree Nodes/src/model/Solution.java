package model;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.addFirst(root);
        int counter = 1;
        while (!deque.isEmpty()) {
            int dequeSize = deque.size();
            while (dequeSize > 0) {
                TreeNode currentNode = deque.removeFirst();
                dequeSize--;
                if (currentNode.left != null) {
                    deque.addLast(currentNode.left);
                    counter++;
                }
                if (currentNode.right != null) {
                    deque.addLast(currentNode.right);
                    counter++;
                }
            }
        }
        return counter;
    }
}
