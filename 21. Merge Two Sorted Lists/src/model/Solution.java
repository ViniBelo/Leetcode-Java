package model;

public class Solution {
//    First attemp
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        if (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                list1.next = mergeTwoLists(list1.next, list2);
//                return list1;
//            } else {
//                list2.next = mergeTwoLists(list1, list2.next);
//                return list2;
//            }
//        }
//        if (list1 == null) {
//            return list2;
//        }
//        return list1;
//    }

    // Second try (no recursion)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current;

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list2.val < list1.val) {
            current = list2;
            list2 = list2.next;
        } else {
            current = list1;
            list1 = list1.next;
        }
        var aux = current;

        while (list1 != null && list2 != null) {
            if (list2.val < list1.val) {
                current.next = list2;
                list2 = list2.next;
            } else {
                current.next = list1;
                list1 = list1.next;
            }
            current = current.next;
        }

        if (list1 == null) {
            current.next = list2;
        } else {
            current.next = list1;
        }

        return aux;
    }
}
