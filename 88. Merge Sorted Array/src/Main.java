import model.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var nums1 = new int[] {4,5,6,0,0,0};
        var m = 3;
        var nums2 = new int[] {1,2,3};
        var n = 3;
        solution.merge(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::println);
    }
}
