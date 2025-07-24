package model;

public class Solution {
//    First try
//    public void moveZeroes(int[] nums) {
//        if (nums.length < 2) return;
//        var left = 0;
//        var right = 1;
//
//        while (left < nums.length - 1) {
//            if (right == nums.length) return;
//            if (nums[left] == 0 & nums[right] == 0) {
//                right++;
//            } else if (nums[left] == 0) {
//                swap(nums, left, right);
//                left++;
//                right++;
//            } else if (nums[right] == 0) {
//                left++;
//            } else {
//                right++;
//            }
//        }
//    }

//    Second try: Better time and visualization
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) return;
        var first = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) swap(nums, first++, i);
        }
    }

    private void swap (int[] nums, int left, int right) {
        var aux = nums[right];
        nums[right] = nums[left];
        nums[left] = aux;
    }
}
