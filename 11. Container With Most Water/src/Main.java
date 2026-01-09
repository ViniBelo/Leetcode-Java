import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution.maxArea(height));
        solution = new Solution();
        int[] height1 = {1, 1};
        System.out.println(solution.maxArea(height1));
        solution = new Solution();
        int[] height2 = {1, 2, 4, 3};
        System.out.println(solution.maxArea(height2));
        solution = new Solution();
        int[] height3 = {4, 3, 2, 1, 4};
        System.out.println(solution.maxArea(height3));
    }
}
