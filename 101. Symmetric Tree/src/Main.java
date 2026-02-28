import model.Solution;
import model.TreeNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode node7 = new TreeNode(3);
        TreeNode node6 = new TreeNode(4);
        TreeNode node5 = new TreeNode(4);
        TreeNode node4 = new TreeNode(3);
        TreeNode node3 = new TreeNode(2, node6, node7);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node1 = new TreeNode(1, node2, node3);

        System.out.println(solution.isSymmetric(node1));
    }
}
