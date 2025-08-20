package newbie.ch4;

/*
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
k is a positive integer and is less than or equal to the length of the linked list.
If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

https://leetcode.com/problems/reverse-nodes-in-k-group/submissions/1694754130/

思路:

先算出每个组的范围
算出第一组
保存每一组的末尾
在下一组反转后,接上


 */
public class Code06_ReverseNodesInKGroup {

    public static void main(String[] args) {
        Code06_ReverseNodesInKGroup c = new Code06_ReverseNodesInKGroup();
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


    // 找的是一组里的最后一个node
    private  ListNode findEnd(ListNode start, int k) {
        // 不等于0! 非大于等于0
        while (--k != 0 && start != null) {
            start = start.next;
        }
        return start;
    }

    private  ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;
        ListNode end = findEnd(head,k);
        // 节点个数不足k
        if (end == null) return head;
        // 第一组新产生的head
        ListNode newHead = reverseInAGroup(head,end);
        ListNode newTail = head;
        // 如果一直有下一组
        while (newTail.next != null) {
            ListNode start = newTail.next;
            end = findEnd(start, k);
            if (end == null) {
                return newHead;
            }
            ListNode newHeadInGroup = reverseInAGroup(start,end);

            newTail.next = newHeadInGroup;
            newTail = start;
        }

        return newHead;

    }

    private static ListNode reverseInAGroup(ListNode head, ListNode end) {
        ListNode pre = null;
        ListNode next = null;
        ListNode start = head;
        end = end.next;
        while (head != end) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        // 这里保持原链表的连续性, 否则之前的起点后面就指向null
        start.next = end;
        return pre;
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
