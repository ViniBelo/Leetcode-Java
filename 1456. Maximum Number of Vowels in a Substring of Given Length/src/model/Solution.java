package model;

import java.util.Set;

public class Solution {
    private final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

    public int maxVowels(String s, int k) {
        int max = 0;
        int left = 0;
        int right = 1;
        int sum = 0;
        while (right <= s.length()) {
            Character currentChar = s.charAt(right - 1);
            Character oldestChar = s.charAt(left);
            if (vowels.contains(currentChar)) sum++;
            max = Math.max(max, sum);
            if (right - left == k){
                if(vowels.contains(oldestChar)) {
                    sum--;
                }
                left++;
            }
            right++;
        }
        return max;
    }
}
