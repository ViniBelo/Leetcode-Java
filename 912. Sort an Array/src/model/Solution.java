package model;

import java.util.Random;

public class Solution {
    private Random random = new Random();

    /** Sort array method
     *
     * @param nums Array to be sorted
     * @return Sorted array
     */
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    /** Quicksort implementation
     *
     * @param nums Array that's gonna be sorted.
     * @param left Pointer to the beginning of data split.
     * @param right Pointer to the end of data split.
     */
    private void quicksort(int[] nums, int left, int right) {
        if (left >= right) return;
        var pivot = partition(nums, left, right);
        quicksort(nums, left, pivot - 1);
        quicksort(nums, pivot + 1, right);
    }

    /** Partition array
     *
     * @param nums Array that's gonna be sorted.
     * @param left Pointer to the beginning of data split.
     * @param right Pointer to the end of data split.
     * @return Pivot index.
     */
    private int partition(int[] nums, int left, int right) {
        // Takes a random number on the array
        var pivotIndex = random.nextInt(left, right);
        // Puts the random number to the end and use it as pivot
        swap(nums, pivotIndex, right);
        // Value that's gonna be sorted
        var pivot = nums[right];
        // Beggining of the partition
        var i = left;

        // Iterates the whole array
        for (int j = left; j < right; j++) {
            // Takes the values smaller than pivot to the left
            if (nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        // Puts the pivot where all left numbers are smaller and all right numbers are bigger
        swap(nums, i, right);
        return i;
    }

    /** Swap values positions function
     *
     * @param nums Array that's gonna be sorted.
     * @param left Pointer to the beginning of data split.
     * @param right Pointer to the end of data split.
     */
    private void swap(int[] nums, int left, int right) {
        var aux = nums[left];
        nums[left] = nums[right];
        nums[right] = aux;
    }
}
