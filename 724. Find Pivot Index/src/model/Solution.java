package model;

public class Solution {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            var left = 0;
            for (int j = 0; j < i; j++) {
                left += nums[j];
            }
            var right = 0;
            for (int k = i + 1; k < nums.length; k++) {
                right += nums[k];
            }
            if (left == right) return i;
        }
        return -1;
    }
}
