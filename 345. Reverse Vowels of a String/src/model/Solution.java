package model;

import java.util.Stack;
import java.util.regex.Pattern;

public class Solution {
    private final Pattern VOWELS_PATTERN = Pattern.compile("([aeiou])", Pattern.CASE_INSENSITIVE);

    public String reverseVowels(String s) {
        if (s.length() == 1) return s;
        var vowels = new Stack<Character>();
        var response = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (VOWELS_PATTERN.matcher(String.valueOf(c)).matches()) vowels.push(c);
        }
        if (vowels.size() <= 1) return s;
        for (char c : s.toCharArray()) {
            if (VOWELS_PATTERN.matcher(String.valueOf(c)).matches()) {
                response.append(vowels.pop());
            } else response.append(c);
        }
        return response.toString();
    }
}
