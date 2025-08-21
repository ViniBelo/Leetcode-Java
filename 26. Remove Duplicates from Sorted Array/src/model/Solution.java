package model;

import java.util.HashMap;

public class Solution {
    public int removeDuplicates(int[] nums) {
        var response = nums.length;
        var counter = new HashMap<Integer, Integer>();
        for (int num: nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        for (int i = response - 1; i >= 0; i--) {
            if (counter.get(nums[i]) > 1) {
                counter.put(nums[i], counter.get(nums[i]) - 1);
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
