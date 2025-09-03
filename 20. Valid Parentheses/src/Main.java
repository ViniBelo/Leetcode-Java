import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var s = "()[]{}";
        System.out.println(solution.isValid(s));
    }
}
