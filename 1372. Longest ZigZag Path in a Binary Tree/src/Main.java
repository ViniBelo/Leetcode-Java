import model.Solution;
import model.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode node7 = new TreeNode(1);
        TreeNode node6 = new TreeNode(1);
        TreeNode node5 = new TreeNode(1, null, node7);
        TreeNode node4 = new TreeNode(1, node5, node6);
        TreeNode node3 = new TreeNode(1);
        TreeNode node2 = new TreeNode(1, null, node4);
        TreeNode node1 = new TreeNode(1, node2, node3);

        System.out.println(solution.longestZigZag(node1));
    }
}
