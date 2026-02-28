import model.Solution;
import model.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode node9 = new TreeNode(8);
        TreeNode node8 = new TreeNode(0);
        TreeNode node7 = new TreeNode(4);
        TreeNode node6 = new TreeNode(7);
        TreeNode node5 = new TreeNode(2, node6, node7);
        TreeNode node4 = new TreeNode(6);
        TreeNode node3 = new TreeNode(1, node8, node9);
        TreeNode node2 = new TreeNode(5, node4, node5);
        TreeNode node1 = new TreeNode(3, node2, node3);

        System.out.println(solution.lowestCommonAncestor(node1, node2, node7));
    }
}
