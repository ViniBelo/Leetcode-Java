package model;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals(t)) return true;
        if (s.isBlank()) return false;
        if (t.isBlank()) return false;
        var i = 0;
        for (int j = 0; j < t.length(); j++) {
            if(s.charAt(i) == t.charAt(j)) i++;
            if (i == s.length()) return true;
        }
        return false;
    }
}
