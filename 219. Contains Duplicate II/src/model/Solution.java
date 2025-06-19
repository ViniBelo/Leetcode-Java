package model;

import java.util.HashSet;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        var counter = new HashSet<Integer>();
        for (int right = 0; right < nums.length; right ++) {
            if (counter.contains(nums[right])) {
                return true;
            }
            counter.add(nums[right]);
            if (right - left >= k) {
                counter.remove(nums[left]);
                left++;
            }
        }
        return false;
    }
}
