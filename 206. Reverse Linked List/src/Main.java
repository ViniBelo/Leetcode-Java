import model.ListNode;
import model.Solution;

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(solution.reverseList(head).val);
    }
}