import model.Solution;
import model.TreeNode;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var node2 = new TreeNode(2);
        var node3 = new TreeNode(3);
        var node1 = new TreeNode(1, node2, node3);

        var node4 = new TreeNode(2);
        var node5 = new TreeNode(3);
        var node6 = new TreeNode(1, node5, node4);
        System.out.println(solution.leafSimilar(node1, node6));
    }
}
