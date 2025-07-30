import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var flowerbed = new int[] {1,0,0,0,1};
        var n = 1;
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }
}
