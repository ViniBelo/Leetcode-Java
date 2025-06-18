package model;

public class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> complements = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (complements.containsKey(target - nums[i])) {
//                return new int[]{complements.get(target - nums[i]), i};
//            }
//            complements.put(nums[i], i);
//        }
//
//        return null;
//    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
