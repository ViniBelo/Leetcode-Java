package model;

import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int stringSize = s.length();

        if (stringSize <= 1) {
            return stringSize;
        }

        HashMap<Character, Integer> letters = new HashMap<>();
        letters.put(s.charAt(0), 1);
        int counter = 1;
        int loopCounter = 1;
        for (int i = 1; i < stringSize; i++) {
            if (letters.containsKey(s.charAt(i))) {
                letters = new HashMap<>();
                counter = Math.max(counter, loopCounter);
                i -= loopCounter;
                loopCounter = 0;
            } else {
                letters.put(s.charAt(i), 1);
                loopCounter++;
            }
        }

        counter = Math.max(counter, loopCounter);
        return counter;
    }
}
