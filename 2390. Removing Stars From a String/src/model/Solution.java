package model;

import java.util.Stack;

public class Solution {
    public String removeStars(String s) {
        var mapper = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                mapper.pop();
            } else mapper.add(s.charAt(i));
        }
        var response = new StringBuilder();
        mapper.forEach(response::append);
        return response.toString();
    }
}
