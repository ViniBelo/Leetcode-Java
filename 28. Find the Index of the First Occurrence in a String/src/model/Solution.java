package model;

public class Solution {
    public int strStr(String haystack, String needle) {
        var i = 0;
        var left = 0;
        for (int right = 0; right < haystack.length(); right++) {
            if (haystack.charAt(right) == needle.charAt(i)) {
                i++;
                if (i == needle.length()) return left;
            } else {
                left++;
                right = left - 1;
                i = 0;
            }
        }
        return -1;
    }
}
