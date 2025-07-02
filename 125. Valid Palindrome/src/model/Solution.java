package model;

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();
        if (s.isEmpty()) return true;
        var left = 0;
        var rigth = s.length() - 1;
        var middle = rigth / 2;

        while (left <= middle) {
            if (s.charAt(left) != s.charAt(rigth)) return false;
            left++;
            rigth--;
        }
        return true;
    }
}
