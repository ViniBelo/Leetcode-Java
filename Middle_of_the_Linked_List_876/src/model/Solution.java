package model;

public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next == null ? fast.next : fast.next.next;
        }
        return slow;
    }
}
