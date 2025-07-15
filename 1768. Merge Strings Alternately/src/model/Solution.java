package model;

public class Solution {
    public String mergeAlternately(String word1, String word2) {
        if (word2.isBlank()) return word1;
        if (word1.isBlank()) return word2;

        var finalWord = "";
        var word1Index = 0;
        var word2Index = 0;
        for (int i = 0; i < word1.length() + word2.length(); i++) {
            if (!(word1.isBlank() && word2.isBlank())) {
                if ((i & 1) == 0) {
                    finalWord = finalWord.concat(String.valueOf(word1.charAt(word1Index)));
                    word1Index++;
                } else {
                    finalWord = finalWord.concat(String.valueOf(word2.charAt(word2Index)));
                    word2Index++;
                }
            }
            if (word1.substring(word1Index).isBlank()) {
                finalWord = finalWord.concat(word2.substring(word2Index));
                break;
            }
            if (word2.substring(word2Index).isBlank()) {
                finalWord = finalWord.concat(word1.substring(word1Index));
                break;
            }
        }
        return finalWord;
    }
}
