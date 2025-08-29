import model.Solution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var nums = new int[] {-4,0,7,4,9,-5,-1,0,-7,-1};
        System.out.println(Arrays.toString(solution.sortArray(nums)));
    }
}
