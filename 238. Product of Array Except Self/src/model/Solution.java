package model;

import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        var zeroes = 0;
        var zeroPosition = 0;
        var productsWithoutZero = 1;
        var response = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes++;
                zeroPosition = i;
            } else productsWithoutZero *= nums[i];
            if (zeroes > 1) {
                Arrays.fill(response, 0);
                return response;
            }
        }
        if (zeroes > 0) {
            Arrays.fill(response, 0);
            response[zeroPosition] = productsWithoutZero;
            return response;
        }

        for (int i = 0; i < nums.length; i++) {
            response[i] = productsWithoutZero / nums[i];
        }
        return response;
    }
}
