import model.Solution;
import model.TreeNode;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var node = new TreeNode(15);
        var node1 = new TreeNode(7);
        var node2 = new TreeNode(20, node, node1);
        var node3 = new TreeNode(9);
        var node4 = new TreeNode(3, node3, node2);
        System.out.println(solution.maxDepth(node4));
    }
}
