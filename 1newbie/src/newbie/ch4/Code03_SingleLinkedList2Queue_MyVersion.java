package newbie.ch4;

/*
1. error !  should be included in else
 */
public class Code03_SingleLinkedList2Queue_MyVersion {
    static Node head;
    static Node tail;



    public static void main(String[] args) {
        Code03_SingleLinkedList2Queue_MyVersion stack = new Code03_SingleLinkedList2Queue_MyVersion();
        stack.push(new Node(1));
        stack.push(new Node(2));
        stack.push(new Node(3));
        stack.push(new Node(4));
        stack.push(new Node(5));

        while (head != null) {
            System.out.print( head.val + " ");
            head = head.next;
        }
        System.out.println();

        stack.push(new Node(1));
        stack.push(new Node(2));
        stack.push(new Node(3));
        stack.push(new Node(4));
        stack.push(new Node(5));

        while (head != null) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

    }


    private void push(Node node) {
        if (head == null) {
            head = new Node(0);
            tail = head;
        }
        // error !  should be included in else
        tail.next = node;
        tail = node;

    }

    private  Node pop() {
        if (head == null) {
            // important   release tail when head is null
            tail = null;
            return null;
        }
        Node toPop = head;
        head = head.next;
        return toPop;
    }

    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }



}
