import model.Solution;
import model.TreeNode;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var treeNode1 = new TreeNode(2);
        var treeNode2 = new TreeNode(3);
        var treeNode = new TreeNode(1, treeNode1, treeNode2);
        var treeNode4 = new TreeNode(2);
        var treeNode5 = new TreeNode(3);
        var treeNode3 = new TreeNode(1, treeNode4, treeNode5);
        System.out.println(solution.isSameTree(treeNode, treeNode3));
    }
}
