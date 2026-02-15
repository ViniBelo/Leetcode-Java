import model.Solution;
import model.TreeNode;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();

        var node6 = new TreeNode(3);
        var node5 = new TreeNode(5);
        var node4 = new TreeNode(1);
        var node3 = new TreeNode(4, node4, node5);
        var node2 = new TreeNode(1, node6);
        var node1 = new TreeNode(3, node2, node3);

//        var node1 = new TreeNode(1);

        System.out.println(solution.goodNodes(node1));
    }
}
