package model;

import java.util.HashSet;

public class Solution {
//    First try
//    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        if (n == 0) return true;
//        if (flowerbed.length == 1) {
//            return n == 1 && flowerbed[0] == 0;
//        }
//        var plantedFlowers = 0;
//        for (int i = 0; i < flowerbed.length; i+=2) {
//            if (i == 0) {
//                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) plantedFlowers++;
//            } else if (i == flowerbed.length - 1) {
//                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) plantedFlowers++;
//            } else if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) plantedFlowers++;
//            if (plantedFlowers == n) return true;
//        }
//        plantedFlowers = 0;
//        for (int i = 1; i < flowerbed.length; i+=2) {
//            if (i == flowerbed.length - 1) {
//                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) plantedFlowers++;
//            } else if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) plantedFlowers++;
//            if (plantedFlowers == n) return true;
//        }
//        return false;
//    }

//    Second try
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        if (flowerbed.length == 1) return n == 1 && flowerbed[0] == 0;
        var map = new int[] {0, 0};
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) map[0]++;
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
                    if ((i & 1) == 0) {
                        map[0]++;
                    } else map[1]++;
                }
            } else if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                if ((i & 1) == 0) {
                    map[0]++;
                } else map[1]++;
            }
            if (map[0] == n || map[1] == n) return true;
        }
        return false;
    }
}
