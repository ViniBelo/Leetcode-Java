package model;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        if (flowerbed.length == 1) {
            return n == 1 && flowerbed[0] == 0;
        }
        var plantedFlowers = 0;
        for (int i = 0; i < flowerbed.length; i+=2) {
            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) plantedFlowers++;
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) plantedFlowers++;
            } else if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) plantedFlowers++;
            if (plantedFlowers == n) return true;
        }
        plantedFlowers = 0;
        for (int i = 1; i < flowerbed.length; i+=2) {
            if (i == flowerbed.length - 1) {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) plantedFlowers++;
            } else if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) plantedFlowers++;
            if (plantedFlowers == n) return true;
        }
        return false;
    }
}
