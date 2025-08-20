package model;

public class Solution {
    public int removeElement(int[] nums, int val) {
        var response = nums.length;
        for (int i = response - 1; i >= 0; i--) {
            if (nums[i] == val) {
                response--;
                for (int j = i; j < response; j++) {
                    swap(nums, j, j + 1);
                }
            }
        }
        return response;
    }

    private void swap(int[] nums, int left, int right) {
        var aux = nums[left];
        nums[left] = nums[right];
        nums[right] = aux;
    }
}
