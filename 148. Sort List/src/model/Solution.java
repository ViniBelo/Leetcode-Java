package model;

public class Solution {
    public ListNode sortList(ListNode head) {
        head = mergeSort(head);
        return head;
    }

    private ListNode findMiddle(ListNode head) {
        var slow = head;
        var fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next != null ? fast.next.next : fast.next;
        }
        return slow;
    }

    private ListNode merge(ListNode list1 , ListNode list2) {
        var head = new ListNode();
        var tail = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 != null) {
            tail.next = list1;
        } else tail.next = list2;
        return head.next;
    }

    private ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) return head;

        var middle = findMiddle(head);
        var afterMiddle = middle.next;
        middle.next = null;
        var left = mergeSort(head);
        var right = mergeSort(afterMiddle);
        return merge(left, right);
    }
}
