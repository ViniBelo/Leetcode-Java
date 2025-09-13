import model.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var nums = new int[] {1,2,3,4};
        System.out.println(Arrays.toString(solution.productExceptSelf(nums)));
    }
}
