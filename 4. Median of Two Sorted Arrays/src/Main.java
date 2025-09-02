import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var nums1 = new int[] {1, 2};
        var nums2 = new int[] {3, 4};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }
}
