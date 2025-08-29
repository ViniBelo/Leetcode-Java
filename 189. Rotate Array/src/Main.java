import model.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var nums = new int[] {1,2,3,4,5,6,7};
        var k = 3;
//        var nums = new int[] {-1,-100,3,99};
//        var k = 2;
        solution.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
