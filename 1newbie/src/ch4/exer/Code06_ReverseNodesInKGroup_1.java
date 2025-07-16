package ch4.exer;

/*
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
k is a positive integer and is less than or equal to the length of the linked list.
If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

https://leetcode.com/problems/reverse-nodes-in-k-group/submissions/1694754130/

 */
public class Code06_ReverseNodesInKGroup_1 {

    public static void main(String[] args) {
        Code06_ReverseNodesInKGroup_1 c = new Code06_ReverseNodesInKGroup_1();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        print(node);

       ListNode newNode =  c.reverseKGroup(node,2 );

        print(newNode);

    }

    private static void print(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }



    private  ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        ListNode end = findEnd(head,k);
        if (end == null) {
            return head;
        }
        ListNode newHead = reverse(head,end);
        while (end != null) {
            ListNode unReversedGroupStart = head.next;
            end = findEnd(unReversedGroupStart,k);
            if (end == null) return newHead;
            ListNode reversedGroupStart = reverse(unReversedGroupStart,end);
            head.next = reversedGroupStart;
            head = unReversedGroupStart;
        }

        return newHead;
    }

    private ListNode reverse(ListNode head, ListNode end) {
        ListNode pre = null;
        ListNode next = null;
        ListNode oldHead = head;
        end = end.next;
        while ( head != end ) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        oldHead.next = end;
        return pre;
    }

    private ListNode findEnd(ListNode head, int k) {
        while (--k > 0  && head != null) {
            head = head.next;
        }
        return head;
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
}
