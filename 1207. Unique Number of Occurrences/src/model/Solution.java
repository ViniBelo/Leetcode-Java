package model;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
//    First try
//    public boolean uniqueOccurrences(int[] arr) {
//        var map = new HashMap<Integer, Integer>();
//        for (Integer val: arr) map.put(val, map.getOrDefault(val, 0) + 1);
//        var set = new HashSet<Integer>();
//        for (Integer val: map.values()) if (!set.add(val)) return false;
//        return true;
//    }

//    Second try, better memory usage, but a little bit slower
    public boolean uniqueOccurrences(int[] arr) {
        var map = new HashMap<Integer, Integer>();
        for (Integer val: arr) map.put(val, map.getOrDefault(val, 0) + 1);
        return map.size() == map.values().stream().distinct().count();
    }
}
