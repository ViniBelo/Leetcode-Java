import model.ListNode;
import model.Solution;

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        var node1 = new ListNode(-1);
        var node2 = new ListNode(5);
        var node3 = new ListNode(3);
        var node4 = new ListNode(4);
        var node5 = new ListNode(0);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        var result = solution.sortList(node1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
