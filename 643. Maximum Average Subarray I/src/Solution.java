import java.util.Arrays;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        var max = 0;
        for (int i = 0; i < k; i++) {
            max += nums[i];
        }
        for (int i = 1, j = k; j < nums.length; i++, j++) {
            var aux = 0;
            for (int l = i; l <= j; l++) {
                aux += nums[l];
            }
            max = Math.max(max, aux);
        }
        return (double) max / k;
    }
}
