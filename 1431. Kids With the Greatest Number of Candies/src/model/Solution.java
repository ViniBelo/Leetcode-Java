package model;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var biggestValue = 0;
        var response = new ArrayList<Boolean>();
        for (int candy: candies) {
            if (candy > biggestValue) biggestValue = candy;
        }
        for (int candy: candies) {
            if (candy + extraCandies >= biggestValue) {
                response.add(true);
            } else response.add(false);
        }
        return response;
    }
}
