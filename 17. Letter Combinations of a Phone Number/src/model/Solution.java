package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static final Map<Character, char[]> PHONE_KEYBOARD = createPhoneKeyboard();
    private List<String> response = new ArrayList<String>();

    private static Map<Character, char[]> createPhoneKeyboard() {
        Map<Character, char[]> map = new HashMap<>();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
        return map;
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return List.of();
        }

        recursiveLetterCombinations("", digits);
        return response;
    }

    private void recursiveLetterCombinations(String permutation, String digits) {

        if (digits.isEmpty()) {
            response.add(permutation);
            return;
        }

        for (Character letter: PHONE_KEYBOARD.get(digits.charAt(0))) {
            recursiveLetterCombinations(permutation.concat(letter.toString()), digits.substring(1));
        }
    }
}
