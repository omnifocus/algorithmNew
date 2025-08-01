package ch4.exer;

public class Code01_SinglyLinkedList_3 {
    public static void main(String[] args) {
        //构建单链表
        Node head = buildLinkedList();
        //遍历单链表
        traverse(head);
        Node newhead = reverseLinkedList(head);
        //遍历单链表
        traverse(newhead);
    }

    private static Node buildLinkedList() {
        Node head = new Node(1);
        Node sec = new Node(2);
        Node thd = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next =sec;
        sec.next = thd;
        thd.next = fourth;
        fourth.next = fifth;
        return head;
    }

    private static void traverse(Node head) {
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node reverseLinkedList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return  pre;
    }



    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
