import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var str1 = "ABCABC";
        var str2 = "ABC";
        System.out.println(solution.gcdOfStrings(str1, str2));
    }
}
