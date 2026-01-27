import model.Solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int k = 2;
        System.out.println(solution.maxOperations(nums, k));
    }
}
