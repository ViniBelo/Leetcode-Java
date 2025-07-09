package model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) return 0;
        var islands = 0;
        var visited = new HashSet<>();
        var rowLimit = grid.length;
        var columnLimit = grid[0].length;
        for (int i = 0; i < rowLimit; i++) {
            for (int j = 0; j < columnLimit; j++) {
                if (grid[i][j] == '1' && !visited.contains(Arrays.asList(i, j))) {
                    dfs(i, j, visited, grid, rowLimit, columnLimit);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void dfs(Integer row,
                     Integer column,
                     Set<Object> visited,
                     char[][] grid,
                     Integer rowLimit,
                     Integer columnLimit) {
        var actualPosition = Arrays.asList(row, column);
        if (row < 0 ||
                column < 0 ||
                row >= rowLimit ||
                column >= columnLimit ||
                !visited.add(actualPosition) ||
                grid[row][column] == '0') return;
        dfs(row - 1, column, visited, grid, rowLimit, columnLimit);
        dfs(row + 1, column, visited, grid, rowLimit, columnLimit);
        dfs(row, column - 1, visited, grid, rowLimit, columnLimit);
        dfs(row, column + 1, visited, grid, rowLimit, columnLimit);
        return;
    }
}
