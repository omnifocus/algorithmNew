package ch4;

/*
given two sorted linkedlist , merge them into one sorted linkedlist

only the head which equalsto minhead need move to next
if vs while


 */
public class Code08_MergeTwoSortedLinkedList {

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);

        ListNode newHead = mergeTwoLinks(head1, head2);
        print(newHead);

    }

    private static ListNode mergeTwoLinks(ListNode head1, ListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        ListNode minHead = head1.val < head2.val ? head1 : head2;
        ListNode doHead = minHead;
//        only the head which equalsto minhead need move to next
        if (head1 == minHead) head1 = head1.next;
       if (head2 == minHead) head2 = head2.next;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                doHead.next = head1;
                head1 = head1.next;
            } else {
                doHead.next = head2;
                head2 = head2.next;
            }
            doHead = doHead.next;
        }
        // below should be both if , not while!
        if (head1 != null) {
            doHead.next = head1;
        }
        if (head2 != null) {
            doHead.next = head2;
        }
        return minHead;
    }


    private static void print(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
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
