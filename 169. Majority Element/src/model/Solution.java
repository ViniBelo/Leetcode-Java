package model;

import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        var counter = new HashMap<Integer, Integer>();
        for (int num: nums) {
            var times = counter.getOrDefault(num, 0) + 1;
            counter.put(num, times);
            if (times > nums.length / 2) return num;
        }
        return nums[0];
    }
}
