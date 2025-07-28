package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        var mapNums1 = new HashMap<Integer, Integer>();
        Arrays.stream(nums1)
                .forEach(num -> {
                        mapNums1.put(num, 1);
                });

        var mapNums2 = new HashMap<Integer, Integer>();
        var list2 = new ArrayList<Integer>();
        Arrays.stream(nums2)
                .forEach(num -> {
                    mapNums2.put(num, 1);
                    if (!mapNums1.containsKey(num)) {
                        list2.add(num);
                        mapNums1.put(num, 1);
                    }
                });

        var list1 = new ArrayList<Integer>();
        Arrays.stream(nums1)
                .forEach(num -> {
                    if (!mapNums2.containsKey(num)) {
                        list1.add(num);
                        mapNums2.put(num, 1);
                    }
                });
        var response = new ArrayList<List<Integer>>();
        response.add(list1);
        response.add(list2);
        return response;
    }
}
