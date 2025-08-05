package model;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int singleNumber(int[] nums) {
        var set = new HashSet<Integer>();
        for (int num: nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else set.add(num);
        }
        return (int) set.toArray()[0];
    }
}
