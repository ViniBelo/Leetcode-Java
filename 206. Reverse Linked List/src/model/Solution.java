package model;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newList = null;
        while (head != null) {
            var next = head.next;
            head.next = newList;
            newList = head;
            head = next;
        }
        return newList;
    }
}
