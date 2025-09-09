package model;

public class Solution {
    public String reverseWords(String s) {
        var words = s.split(" ");
        var response = new StringBuilder();
        response.append(words[words.length - 1]);
        for (int i = words.length - 2; i >= 0; i--) {
            if (!words[i].isBlank()) response.append(" ").append(words[i]);
        }
        return response.toString();
    }
}
