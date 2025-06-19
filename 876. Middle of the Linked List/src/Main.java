import model.ListNode;
import model.Solution;

class Main {
    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        Solution solution = new Solution();
        ListNode result = solution.middleNode(list);
        System.out.println(result.val);
    }
}