package model;

public class Solution {
    public int largestAltitude(int[] gain) {
        var highest = 0;
        var current = 0;
        for (int next: gain) {
            current += next;
            if (current > highest) highest = current;
        }
        return highest;
    }
}
