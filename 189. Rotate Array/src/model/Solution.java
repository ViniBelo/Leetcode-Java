package model;

public class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == k) return;
        if (nums.length < k) k = k - nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k % nums.length - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, Integer left, Integer right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    private void swap(int[] nums, Integer left, Integer right) {
        var aux = nums[left];
        nums[left] = nums[right];
        nums[right] = aux;
    }
}
