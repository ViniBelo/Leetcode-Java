package model;

import java.util.Random;

public class Solution {
    private Random rand = new Random();
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quicksort(int[] nums, Integer left, Integer right) {
        if (left >= right) return;

        var pivot = partition(nums, left, right);

        quicksort(nums, left, pivot - 1);
        quicksort(nums, pivot + 1, right);
    }

    private int partition(int[] nums, Integer left, Integer right) {
        int pivotIndex = left + rand.nextInt(right - left + 1);
        swap(nums, pivotIndex, right);

        var pivot = nums[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (nums[j] < pivot) {
                swap(nums, j, i);
                i++;
            }
        }
        swap(nums, i, right);
        return i;
    }

    private void swap (int[] nums, int left, int right) {
        var aux = nums[left];
        nums[left] = nums[right];
        nums[right] = aux;
    }
}
