//import java.util.HashSet;
//
//public static void main(String[] args) {
//    int[] arr1 = {1,2,3,1};
//    int[] arr2 = {1,0,1,1};
//    int[] arr3 = {1,2,3,1,2,3};
//    int[] arr4 = {1,2,2,3};
//    System.out.println(containsNearbyDuplicate(arr1, 3)); // true
//    System.out.println(containsNearbyDuplicate(arr2, 1)); // true
//    System.out.println(containsNearbyDuplicate(arr3, 2)); // false
//    System.out.println(containsNearbyDuplicate(arr4, 3)); // true
//}
//
//static boolean containsNearbyDuplicate(int[] nums, int k) {
//    int left = 0;
//    var counter = new HashSet<Integer>();
//    for (int right = 0; right < nums.length; right ++) {
//        if (counter.contains(nums[right])) {
//            return true;
//        }
//        counter.add(nums[right]);
//        if (right - left >= k) {
//            counter.remove(nums[left]);
//            left++;
//        }
//    }
//    return false;
//}
