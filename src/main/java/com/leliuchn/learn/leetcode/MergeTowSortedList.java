package com.leliuchn.learn.leetcode;

/**
 * Created by leliuchn on 17/9/28.
 */
public class MergeTowSortedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode listNodeHead = null;
        ListNode headPointer = null;
        ListNode l1Pointer = l1;
        ListNode l2Pointer = l2;
        while (l1Pointer != null && l2Pointer != null) {
            int value = 0;
            if (l1Pointer.val < l2Pointer.val) {
                value = l1Pointer.val;
                l1Pointer = l1Pointer.next;
            } else {
                value = l2Pointer.val;
                l2Pointer = l2Pointer.next;
            }

            if(listNodeHead == null) {
                listNodeHead = new ListNode(value);
                headPointer = listNodeHead;
            }else{
                ListNode listNodeTmp = new ListNode(value);
                headPointer.next = listNodeTmp;
                headPointer = headPointer.next;
            }
        }

        while (l1Pointer != null) {
            if(listNodeHead == null) {
                listNodeHead = new ListNode(l1Pointer.val);
                headPointer = listNodeHead;
            }else{
                ListNode listNodeTmp = new ListNode(l1Pointer.val);
                headPointer.next = listNodeTmp;
                headPointer = headPointer.next;
            }
            l1Pointer = l1Pointer.next;
        }

        while (l2Pointer != null) {
            if(listNodeHead == null) {
                listNodeHead = new ListNode(l2Pointer.val);
                headPointer = listNodeHead;
            }else{
                ListNode listNodeTmp = new ListNode(l2Pointer.val);
                headPointer.next = listNodeTmp;
                headPointer = headPointer.next;
            }
            l2Pointer = l2Pointer.next;
        }

        return headPointer;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}





