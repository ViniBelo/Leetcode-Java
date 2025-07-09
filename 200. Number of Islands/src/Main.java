import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var arr = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(solution.numIslands(arr));
    }
}
