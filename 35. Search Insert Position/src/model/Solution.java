package model;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;
        while (left <= right) {
            var middle = (left + right) / 2;
            if (left + 1 == right) {
                return target > nums[left] ? right : left;
            }
            if(nums[middle] > target) {
                right = middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else return middle;
        }
        return -1;
    }
}
