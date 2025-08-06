import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var arr = new int[] {1,2,2,1,1,3};
        System.out.println(solution.uniqueOccurrences(arr));
    }
}
