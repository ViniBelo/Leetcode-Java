package model;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int maxLevelSum(TreeNode root) {
        return bfs(root);
    }

    private int bfs(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int maxSumLayer = 1;
        int max = root.val;
        for (int i = 1; !queue.isEmpty(); i++) {
            int layerSum = 0;
            int queueSize = queue.size();
            for (int j = 0; j < queueSize; j++) {
                TreeNode currentNode = queue.removeFirst();
                layerSum += currentNode.val;
                if (currentNode.left != null) {
                    queue.addLast(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.addLast(currentNode.right);
                }
            }
            if (layerSum > max) {
                max = layerSum;
                maxSumLayer = i;
            }
        }
        return maxSumLayer;
    }
}
