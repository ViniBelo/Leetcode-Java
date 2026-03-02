import model.Solution;
import model.TreeNode;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();

        var node9 = new TreeNode(1);
        var node8 = new TreeNode(4, null, node9);
        var node7 = new TreeNode(13);
        var node6 = new TreeNode(2);
        var node5 = new TreeNode(7);
        var node4 = new TreeNode(11, node5, node6);
        var node3 = new TreeNode(8, node7, node8);
        var node2 = new TreeNode(4, node4);
        var node1 = new TreeNode(5, node2, node3);

        System.out.println(solution.hasPathSum(node1, 22));
    }
}
