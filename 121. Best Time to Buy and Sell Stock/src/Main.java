import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var prices = new int[] {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(prices));
    }
}
