import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var test1 = "abcabcbb";
        var test2 = "bbbbb";
        var test3 = "pwwkew";
        var test4 = "   ";
        var test5 = "au";

        System.out.println(solution.lengthOfLongestSubstring(test1));
        System.out.println(solution.lengthOfLongestSubstring(test2));
        System.out.println(solution.lengthOfLongestSubstring(test3));
        System.out.println(solution.lengthOfLongestSubstring(test4));
        System.out.println(solution.lengthOfLongestSubstring(test5));
    }
}
