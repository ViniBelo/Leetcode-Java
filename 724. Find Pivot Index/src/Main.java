import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var nums = new int[] {1,7,3,6,5,6};
        System.out.println(solution.pivotIndex(nums));
    }
}
