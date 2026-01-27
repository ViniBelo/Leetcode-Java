import model.ListNode;
import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var node1 = new ListNode(1);
        var node2 = new ListNode(2);
        var node3 = new ListNode(3);
        var node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        var result = solution.swapPairs(node1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
