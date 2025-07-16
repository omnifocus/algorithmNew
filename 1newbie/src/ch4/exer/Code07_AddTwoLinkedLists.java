package ch4.exer;

/*
给定两个链表的头节点head1和head2,
认为从左到右是某个数字从低位到高位，返回相加之后的链表
例子4->3->6  2->5-> 3
返回6-> 8-> 9
解释634 + 352= 986

依次是 个位 十位 百位

699 + 999 =  1698
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

    //TODO
    private static ListNode addTwoLinks(ListNode head1, ListNode head2) {
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
