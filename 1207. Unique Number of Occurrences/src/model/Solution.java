package model;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        var map = new HashMap<Integer, Integer>();
        for (Integer val: arr) map.put(val, map.getOrDefault(val, 0) + 1);
        var set = new HashSet<Integer>();
        for (Integer val: map.values()) if (!set.add(val)) return false;
        return true;
    }
}
