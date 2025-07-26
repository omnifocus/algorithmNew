package ch6.exer;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
public class Code01_MergeKSortedList {

    public static void main(String[] args) {
        ListNode[] listNodes = new ListNode[3];
//        listNodes[0] = new ListNode(1);
//        listNodes[0].next = new ListNode(4);
//        listNodes[0].next.next = new ListNode(5);
//
//        listNodes[1] = new ListNode(1);
//        listNodes[1].next = new ListNode(3);
//        listNodes[1].next.next = new ListNode(4);
//
//        listNodes[2] = new ListNode(2);
//        listNodes[2].next = new ListNode(6);


        listNodes[0] = null;

        listNodes[1] = new ListNode(1);

        ListNode listNode = new Code01_MergeKSortedList().mergeKLists(listNodes);
        System.out.println(listNode);
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode mergeKLists(ListNode[] lists) {
       return null;
    }
}
