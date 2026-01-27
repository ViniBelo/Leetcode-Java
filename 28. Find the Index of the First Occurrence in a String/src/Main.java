import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var haystack = "mississippi";
        var needle = "issip";
        System.out.println(solution.strStr(haystack, needle));
    }
}
