import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var gain = new int[] {-5,1,5,0,-7};
        System.out.println(solution.largestAltitude(gain));
    }
}
