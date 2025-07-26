package ch6;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *  for循环不能写在判断条件中,否则第一个元素不满足就不往下走了
 *  节点要加一个影子,否则返回的是最后节点
 *  https://leetcode.com/problems/merge-k-sorted-lists/
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
        if (lists == null || lists.length <= 0) return null;
        ListNode res = null;
        PriorityQueue<ListNode> queue = new PriorityQueue(new Comparator<ListNode>() {
            public int compare(ListNode a, ListNode b) {
                return a.val - b.val;
            }
        });
        for (int i = 0; i < lists.length ; i++) {
            // 不能写在判断条件中,否则第一个元素不满足就不往下走了
            if (lists[i] != null)
            queue.add(lists[i]);
        }
        // 如果加的元素都是空
        if (queue.isEmpty()) return null;

        res = queue.poll();

        if (res.next != null)
            queue.add(res.next);

        ListNode resP = res;
        while (!queue.isEmpty()) {
            ListNode cur = queue.poll();
            // if (cur != null) {
            resP.next = cur;
            if (cur.next != null) {
                queue.add(cur.next);
            }
            resP = resP.next;

            // }
        }

        return res;

    }
}
