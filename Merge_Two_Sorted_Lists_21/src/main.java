import model.ListNode;
import model.Solution;

public static void main(String[] args) {
    ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    Solution solution = new Solution();
    ListNode result = solution.mergeTwoLists(l1, l2);
    while (result != null) {
        System.out.println(result.val);
        result = result.next;
    }
}