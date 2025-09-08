package model;

public class Solution {
    public int lengthOfLastWord(String s) {
        var words = s.split(" ");
        var lastWord = words[words.length - 1];
        var counter = 0;
        for (int i = 0; i < lastWord.length(); i++) {
            counter++;
        }
        return counter;
    }
}
