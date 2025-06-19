package model;

import java.util.HashMap;

public class Solution {
//    My first try, not that optimized...
//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            hashMap.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (hashMap.containsKey(target - nums[i]) && i != hashMap.get(target - nums[i])) {
//                return new int[]{hashMap.get(target - nums[i]), i};
//            }
//        }
//        return null;
//    }

//    Fastest algorithm for big volume of values
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (complements.containsKey(target - nums[i])) {
                return new int[]{complements.get(target - nums[i]), i};
            }
            complements.put(nums[i], i);
        }

        return null;
    }

//    Fastest algorithm for small volume of values
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (i != j && nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
//    }
}
