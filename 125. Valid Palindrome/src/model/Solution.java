package model;

public class Solution {
//    First try
//    public boolean isPalindrome(String s) {
//        s = s.replaceAll("[^a-zA-Z0-9]", "")
//                .toLowerCase();
//        if (s.isEmpty()) return true;
//        var left = 0;
//        var rigth = s.length() - 1;
//        var middle = rigth / 2;
//
//        while (left <= middle) {
//            if (s.charAt(left) != s.charAt(rigth)) return false;
//            left++;
//            rigth--;
//        }
//        return true;
//    }

//    Second try
    public boolean isPalindrome(String s) {
        var left = 0;
        var right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else if (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
