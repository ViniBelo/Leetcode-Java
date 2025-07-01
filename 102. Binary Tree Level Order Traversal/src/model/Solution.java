package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return List.of();
        var arraysMapper = new HashMap<Integer, List<Integer>>();
        checkLayerDfs(root, 0, arraysMapper);
        var response = new ArrayList<List<Integer>>(new ArrayList<>());
        for (int i = 0; i < arraysMapper.size(); i++) {
            response.add(arraysMapper.get(i));
        }
        return response;
    }

    private void checkLayerDfs(TreeNode current,
                               Integer layer,
                               HashMap<Integer, List<Integer>> arraysMapper) {
        if (current == null) return;
        var actualList = arraysMapper.containsKey(layer) ? arraysMapper.get(layer) : new ArrayList<Integer>();
        actualList.add(current.val);
        arraysMapper.put(layer, actualList);
        checkLayerDfs(current.left, layer + 1, arraysMapper);
        checkLayerDfs(current.right, layer + 1, arraysMapper);
    }
}
