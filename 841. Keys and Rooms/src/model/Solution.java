package model;

import java.util.List;

public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(0, rooms, visited);
        for (boolean b : visited) {
            if (!b) return false;
        }
        return true;
    }

    private void dfs(Integer index, List<List<Integer>> rooms, boolean[] visited) {
        visited[index] = true;
        rooms.get(index).forEach((key) -> {
            if (!visited[key]) {
                dfs(key, rooms, visited);
            }
        });
    }
}
