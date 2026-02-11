package model;

import java.util.*;

public class Solution {
//    First attemp
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        if (root == null) return List.of();
//        var arraysMapper = new HashMap<Integer, List<Integer>>();
//        checkLayerDfs(root, 0, arraysMapper);
//        var response = new ArrayList<List<Integer>>(new ArrayList<>());
//        for (int i = 0; i < arraysMapper.size(); i++) {
//            response.add(arraysMapper.get(i));
//        }
//        return response;
//    }
//
//    private void checkLayerDfs(TreeNode current,
//                               Integer layer,
//                               HashMap<Integer, List<Integer>> arraysMapper) {
//        if (current == null) return;
//        var actualList = arraysMapper.containsKey(layer) ? arraysMapper.get(layer) : new ArrayList<Integer>();
//        actualList.add(current.val);
//        arraysMapper.put(layer, actualList);
//        checkLayerDfs(current.left, layer + 1, arraysMapper);
//        checkLayerDfs(current.right, layer + 1, arraysMapper);
//    }

//    Second Attemp
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return List.of();
        return bfs(root);
    }

    private List<List<Integer>> bfs(TreeNode root) {
        List<List<Integer>> response = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        response.add(List.of(root.val));

        while (!queue.isEmpty()) {
            List<Integer> levelNodes = new ArrayList<>();
            for (int i = 0; i < queue.size(); i++) {
                TreeNode currentNode = queue.removeFirst();
                if (currentNode.left != null) {
                    queue.addLast(currentNode.left);
                    levelNodes.add(currentNode.left.val);
                }
                if (currentNode.right != null) {
                    queue.addLast(currentNode.right);
                    levelNodes.add(currentNode.right.val);
                }
            }
            if (!levelNodes.isEmpty()) response.add(levelNodes);
        }
        return response;
    }
}
