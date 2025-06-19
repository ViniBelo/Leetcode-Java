package model;

public class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;
        for (int i = 1; i <= n; i++) {
            int aux = i;
            while (aux > 0) {
                aux &= (aux - 1);
                ans[i]++;
            }
        }
        return ans;
    }
}
