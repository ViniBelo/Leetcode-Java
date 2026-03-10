import model.Solution;
import model.TreeNode;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var node6 = new TreeNode(6);
        var node5 = new TreeNode(5);
        var node4 = new TreeNode(4);
        var node3 = new TreeNode(3, node6);
        var node2 = new TreeNode(2, node4, node5);
        var node1 = new TreeNode(1, node2, node3);
        System.out.println(solution.countNodes(node1));
    }
}
