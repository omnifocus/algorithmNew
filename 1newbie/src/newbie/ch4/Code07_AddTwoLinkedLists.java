package newbie.ch4;

/*
给定两个链表的头节点head1和head2,
认为从左到右是某个数字从低位到高位，返回相加之后的链表
例子4->3->6  2->5-> 3
返回6-> 8-> 9
解释634 + 352= 986


699 + 999 =  1698
依次是 个位 十位 百位

 */
public class Code07_AddTwoLinkedLists {

    public static void main(String[] args) {

        ListNode head1 = new ListNode(9);
        head1.next = new ListNode(9);
        head1.next.next = new ListNode(6);

        ListNode head2 = new ListNode(9);
        head2.next = new ListNode(9);
        head2.next.next = new ListNode(9);

        ListNode newHead = addTwoLinks(head1, head2);
        print(newHead);

    }

    private static ListNode addTwoLinks(ListNode head1, ListNode head2) {
        ListNode longNode = findLongestLinkedList(head1, head2);
        ListNode shortNode = longNode == head1 ? head2 : head1;
        ListNode resultNode = longNode;
        ListNode tailNode = null;
        int carrier = 0;
        while (shortNode != null) {
            int v = longNode.val + shortNode.val + carrier;
            if (v / 10 > 0) {
                carrier = 1;
            }
            longNode.val = v % 10;
            tailNode = longNode;
            longNode = longNode.next;
            shortNode = shortNode.next;

        }
        while (longNode != null) {
            int v = longNode.val  + carrier;
            if (v / 10 > 0) {
                carrier = 1;
            }
            longNode.val = v % 10;
            tailNode = longNode;
            longNode = longNode.next;
        }
        if (carrier > 0) {
            tailNode.next = new ListNode(1);
        }

        return resultNode;

    }

    private static ListNode findLongestLinkedList(ListNode head1, ListNode head2) {
        ListNode head1copy = head1;
        ListNode head2copy = head2;
        while (head1copy != null) {
            head1copy = head1copy.next ;
            head2copy = head2copy.next;
        }
        return head1copy == null ? head2 : head1;
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
