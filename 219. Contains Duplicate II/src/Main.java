import model.Solution;

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {1,2,3,1};
        int[] arr2 = {1,0,1,1};
        int[] arr3 = {1,2,3,1,2,3};
        int[] arr4 = {1,2,2,3};
        System.out.println(solution.containsNearbyDuplicate(arr1, 3)); // true
        System.out.println(solution.containsNearbyDuplicate(arr2, 1)); // true
        System.out.println(solution.containsNearbyDuplicate(arr3, 2)); // false
        System.out.println(solution.containsNearbyDuplicate(arr4, 3)); // true
    }
}