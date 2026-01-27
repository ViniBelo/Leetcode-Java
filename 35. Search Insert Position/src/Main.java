import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var nums = new int[]{1,3,5,6};
        var target = 2;
        System.out.println(solution.searchInsert(nums, target));
    }
}
