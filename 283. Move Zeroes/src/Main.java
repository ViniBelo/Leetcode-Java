import model.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var nums = new int[] {0, 1, 0, 3, 12};
        var nums1 = new int[] {2, 1};
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
