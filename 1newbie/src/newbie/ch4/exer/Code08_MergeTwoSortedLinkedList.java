package newbie.ch4.exer;

/*
given two sorted linkedlist , merge them into one sorted linkedlist

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
        return null;
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
