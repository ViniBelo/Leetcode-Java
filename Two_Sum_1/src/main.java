import model.Solution;

import java.util.Arrays;

public static void main(String[] args) {
    Solution solution = new Solution();
    int[] arr1 = {2,7,11,15};
    int[] arr2 = {3, 2, 4};
    int[] arr3 = {-1,-2,-3,-4,-5};
    System.out.println(Arrays.toString(solution.twoSum(arr1, 9)));
    System.out.println(Arrays.toString(solution.twoSum(arr2, 6)));
    System.out.println(Arrays.toString(solution.twoSum(arr3, -8)));
}