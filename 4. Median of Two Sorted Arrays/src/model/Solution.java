package model;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        var array = merge(nums1, nums2);
        if ((array.length & 1) == 1) return (double) array[(array.length - 1) / 2];
        var firstValue = (double) array[array.length / 2];
        var secondValue = (double) array[(array.length - 1) / 2];
        return (firstValue + secondValue) / 2;
    }

    private int[] merge(int[] nums1, int[] nums2) {
        var mergedArray = new int[nums1.length + nums2.length];
        var i = 0;
        var j = 0;
        var k = 0;
        while (j < nums1.length && k < nums2.length) {
            if (nums1[j] <= nums2[k]) {
                mergedArray[i] = nums1[j];
                j++;
            } else {
                mergedArray[i] = nums2[k];
                k++;
            }
            i++;
        }
        if (j < nums1.length) {
            mergeRest(mergedArray, i, nums1, j);
        } else mergeRest(mergedArray, i, nums2, k);
        return mergedArray;
    }

    private void mergeRest(int[] mergedArray, Integer i, int[] restArray, Integer j) {
        while (j < restArray.length) {
            mergedArray[i] = restArray[j];
            i++;
            j++;
        }
    }
}
