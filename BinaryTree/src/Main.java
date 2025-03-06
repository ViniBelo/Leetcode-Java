import model.BinaryTree;

public class Main {
    public static void main(String[] args) {
        var binaryTree = new BinaryTree();
        binaryTree.insert(5);
        binaryTree.insert(4);
        binaryTree.insert(6);
        binaryTree.insert(3);
        binaryTree.insert(7);
        System.out.println(binaryTree.search(6));
    }
}
