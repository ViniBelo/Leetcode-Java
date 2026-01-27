package model;

public class Solution {
    public int maxOperations(int[] nums, int k) {
        int max = 0;
        int right = nums.length - 1;
        for (int i = 0; i < right; i++) {
            if (nums[i] < k) {
                boolean foundPair = false;
                for (int j = i + 1; j <= right && !foundPair; j++) {
                    if (nums[i] + nums[j] == k) {
                        max++;
                        foundPair = true;
                        swap(nums, j, right);
                        right--;
                    }
                }
            }
        }
        return max;
    }

    private void swap(int[] nums, int left, int right) {
        var aux = nums[left];
        nums[left] = nums[right];
        nums[right] = aux;
    }
}
