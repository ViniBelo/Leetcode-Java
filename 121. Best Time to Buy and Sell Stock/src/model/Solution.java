package model;

import java.util.HashSet;

public class Solution {
    public int maxProfit(int[] prices) {
        var biggestProfit = 0;
        var visited = new HashSet<Integer>();
        for (int i = 0; i < prices.length; i++) {
            if (!visited.contains(prices[i])) {
                visited.add(prices[i]);
                for (int j = i + 1; j < prices.length; j++) {
                    var diff = prices[j] - prices[i];
                    biggestProfit = Math.max(biggestProfit, diff);
                }
            }
        }
        return biggestProfit;
    }
}
