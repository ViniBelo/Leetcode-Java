import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var s = "abc";
        var t = "ahbgdc";
        System.out.println(solution.isSubsequence(s, t));
    }
}
