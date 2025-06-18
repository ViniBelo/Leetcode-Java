import model.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();

        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {3, 2, 4};
        int[] nums3 = {3, 3};

        System.out.println(Arrays.toString(solution.twoSum(nums1, 9)));
        System.out.println(Arrays.toString(solution.twoSum(nums2, 6)));
        System.out.println(Arrays.toString(solution.twoSum(nums3, 6)));
    }
}
