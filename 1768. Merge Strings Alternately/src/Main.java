import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var word1 = "abc";
        var word2 = "pqr";
        System.out.println(solution.mergeAlternately(word1, word2));
    }
}
