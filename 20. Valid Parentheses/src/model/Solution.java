package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    Map<Character, Character> map = new HashMap<>();

    public Solution() {
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
    }

    public boolean isValid(String s) {
        if ((s.length() & 1) == 1) return false;
        var brackets = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsValue(s.charAt(i))) {
                brackets.push(s.charAt(i));
            } else {
                if (brackets.empty() || brackets.pop() != map.get(s.charAt(i))) return false;
            }
        }
        return brackets.empty();
    }
}
