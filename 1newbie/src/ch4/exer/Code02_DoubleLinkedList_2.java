package ch4.exer;

public class Code02_DoubleLinkedList_2 {
    
    
    private static class Node {
        int val;
        Node pre;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node head = constructDoubleLinkedList();
        print(head);
        Node newHead = reverse(head);
        print(newHead);
    }


    private static Node constructDoubleLinkedList() {
        Node head = new Node(0);
        // construct 7 nodes, with head as the first node
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        head.next = n1;
        n1.pre = head;
        n1.next = n2;
        n2.pre = n1;
        n2.next = n3;
        n3.pre = n2;
        n3.next = n4;
        n4.pre = n3;
        n4.next = n5;
        n5.pre = n4;
        n5.next = n6;
        n6.pre = n5;

        return head;

    }

    private static void print(Node head) {
        Node last = null;
        while (head != null) {
            System.out.print(head.val + " ");
            last = head;
            head = head.next;
        }
        System.out.println();

        while (last != null) {
            System.out.print(last.val + " ");
            last = last.pre;
        }
        System.out.println();
    }

    private static Node reverse(Node head) {
       Node pre = null;
       Node next = null;
       while (head != null) {
           next = head.next;
           head.next = pre;
           head.pre = next;
           pre = head;
           head = next;
       }
       return pre;
    }


}
