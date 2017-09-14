package com.leliuchn.learn.leetcode;

/**
 * Created by leliuchn on 17/9/14.
 */

class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
}

public class AddTwoNums {

    public static void main(String args[]){
        ListNode listNodeA = new ListNode(2);
        ListNode listNodeA1 = new ListNode(4);
        ListNode listNodeA2 = new ListNode(3);
        listNodeA.next = listNodeA1;
        listNodeA.next.next = listNodeA2;

        ListNode listNodeB = new ListNode(5);
        ListNode listNodeB1 = new ListNode(6);
        ListNode listNodeB2 = new ListNode(4);
        listNodeB.next = listNodeB1;
        listNodeB.next.next = listNodeB2;

        AddTwoNums addTwoNums = new AddTwoNums();
        ListNode sumList = addTwoNums.addTwoNumbers(listNodeA, listNodeB);
        addTwoNums.printListNode(sumList);
    }

//    public ListNode buildListNode(){
//        int i = 3;
//        ListNode listNode = null;
//
//        while(i > 0){
//
//        }
//    }

    public void printListNode(ListNode listNode){
        ListNode p = listNode;
        while(p != null){
            System.out.print(p.val + "->");
            p = p .next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNodeHead = null;
        int addOneFlag = 0;
        ListNode headPointer = null;

        while(l1!= null && l2!= null){
            int sum = l1.val + l2.val + addOneFlag;
            if(sum >= 10) {
                sum = sum - 10;
                addOneFlag = 1;
            }else{
                addOneFlag = 0;
            }
            if(listNodeHead == null) {
                listNodeHead = new ListNode(sum);
                headPointer = listNodeHead;
            }else{
                ListNode listNodeTmp = new ListNode(sum);
                headPointer.next = listNodeTmp;
                headPointer = headPointer.next;
            }

            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            int sum = l1.val + addOneFlag;
            if(sum >= 10) {
                sum = sum - 10;
                addOneFlag = 1;
            }else{
                addOneFlag = 0;
            }
            ListNode listNodeTmp = new ListNode(sum);
            headPointer.next = listNodeTmp;
            headPointer = headPointer.next;
            l1 = l1.next;
        }

        while(l2 != null){
            int sum = l2.val + addOneFlag;
            if(sum >= 10) {
                sum = sum - 10;
                addOneFlag = 1;
            }else{
                addOneFlag = 0;
            }
            ListNode listNodeTmp = new ListNode(sum);
            headPointer.next = listNodeTmp;
            headPointer = headPointer.next;
            l2 = l2.next;
        }
        if(l1 == null && l2 == null && addOneFlag != 0){
            ListNode listNodeTmp = new ListNode(addOneFlag);
            headPointer.next = listNodeTmp;
            headPointer = headPointer.next;
        }
        return listNodeHead;
    }
}
