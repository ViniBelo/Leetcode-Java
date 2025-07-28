import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
//        var arr1 = new int[] {1, 2, 3};
//        var arr2 = new int[] {2, 4, 6};
        var arr1 = new int[] {1,2,3,3};
        var arr2 = new int[] {1,1,2,2};
        System.out.println(solution.findDifference(arr1, arr2));
    }
}
