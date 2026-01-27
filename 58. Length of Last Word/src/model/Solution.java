package model;

public class Solution {
//    First implementation:
//    public int lengthOfLastWord(String s) {
//        var words = s.split(" ");
//        var lastWord = words[words.length - 1];
//        var counter = 0;
//        for (int i = 0; i < lastWord.length(); i++) {
//            counter++;
//        }
//        return counter;
//    }

//    Fastest implementation
    public int lengthOfLastWord(String s) {
        var counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                counter++;
            } else if (counter > 0) return counter;
        }
        return counter;
    }
}
