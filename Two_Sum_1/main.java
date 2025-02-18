//import java.util.Arrays;
//import java.util.HashMap;
//
//public static void main(String[] args) {
//    int[] arr1 = {2,7,11,15};
//    int[] arr2 = {3, 2, 4};
//    int[] arr3 = {-1,-2,-3,-4,-5};
//    System.out.println(Arrays.toString(twoSum(arr1, 9)));
//    System.out.println(Arrays.toString(twoSum(arr2, 6)));
//    System.out.println(Arrays.toString(twoSum(arr3, -8)));
//}
//
//public static int[] twoSum(int[] nums, int target) {
//    HashMap<Integer, Integer> hashMap = new HashMap<>();
//    for (int i = 0; i < nums.length; i++) {
//        hashMap.put(nums[i], i);
//    }
//    for (int i = 0; i < nums.length; i++) {
//        if (hashMap.containsKey(target - nums[i]) && i != hashMap.get(target - nums[i])) {
//            return new int[]{hashMap.get(target - nums[i]), i};
//        }
//    }
//    return null;
//}