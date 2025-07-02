import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();

        var string1 = "A man, a plan, a canal: Panama";
        var string2 = "race a car";
        var string3 = " ";
        var string4 = "0P";

        System.out.println(solution.isPalindrome(string1));
        System.out.println(solution.isPalindrome(string2));
        System.out.println(solution.isPalindrome(string3));
        System.out.println(solution.isPalindrome(string4));
    }
}
