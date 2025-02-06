public static void main(String[] args) {
    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    System.out.println(reverseList(head).val);
}

public static ListNode reverseList(ListNode head) {
    ListNode newList = null;
    while (head != null) {
        ListNode next = head.next;
        head.next = newList;
        newList = head;
        head = next;
    }
    return newList;
}

public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}