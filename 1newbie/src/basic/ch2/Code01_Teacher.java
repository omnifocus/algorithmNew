package basic.ch2;

/**
 * 链表删掉某个值
 */
public class Code01_Teacher {
    private static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(4);
        Node n2 = new Node(3);
        Node n3 = new Node(5);
        Node n4 = new Node(2);
        Node n5 = new Node(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;


        Node head = f(n1,3);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    //TODO
    private static Node f(Node head, int target) {
        while (head != null) {
            if (head.val != target) {
                break;
            }
            head = head.next;
        }
        Node pre = head;
        Node cur = head;

        while (cur != null) {
            if (cur.val == target) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }

        return head;


    }
}
