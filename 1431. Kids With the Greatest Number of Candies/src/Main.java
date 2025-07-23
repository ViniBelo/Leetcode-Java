import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var candies = new int[]{2, 3, 5, 1, 3};
        var extraCandies = 3;
        System.out.println(solution.kidsWithCandies(candies, extraCandies));
    }
}
