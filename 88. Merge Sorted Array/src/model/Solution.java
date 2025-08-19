package model;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
            return;
        }
        m--;
        n--;
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (m == -1) {
                swap(nums1, i, nums2, n);
                n--;
            } else if (n == -1) {
                swap(nums1, i, nums1, m);
                m--;
            } else if (nums1[i] == 0) {
                if (nums1[m] > nums2[n]) {
                    swap(nums1, i, nums1, m);
                    m--;
                } else {
                    swap(nums1, i, nums2, n);
                    n--;
                }
            }
        }
    }

    private void swap(int[] nums1, int i, int[] nums2, int j) {
        var aux = nums1[i];
        nums1[i] = nums2[j];
        nums2[j] = aux;
    }
}
