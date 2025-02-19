import model.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var sort = new Sort();
        int[] arr = {7, 4, 9, 1, 12, 6, 3};
        sort.quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}