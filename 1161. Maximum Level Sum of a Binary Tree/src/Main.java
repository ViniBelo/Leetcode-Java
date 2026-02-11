import model.Solution;
import model.TreeNode;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();

//        var node5 = new TreeNode(-8);
//        var node4 = new TreeNode(7);
//        var node3 = new TreeNode(7, node4, node5);
//        var node2 = new TreeNode(0);
//        var node1 = new TreeNode(1, node3, node2);

        var node6 = new TreeNode(-10);
        var node5 = new TreeNode(-5);
        var node4 = new TreeNode(-20);
        var node3 = new TreeNode(-300, node4, node5);
        var node2 = new TreeNode(-200, node6);
        var node1 = new TreeNode(-100, node3, node2);

        System.out.println(solution.maxLevelSum(node1));
    }
}
