package ch4;

public class Code03_SingleLinkedList2Queue_TeacherVersion {




    private static class Queue<V> {
        private Node<V> head;
        private Node<V> tail;
        private int size;
        public Queue() {
            head = null;
            tail = null;
            size = 0;
        }

        public V pop() {
            if (head == null) {
                tail = null;
                return null;
            }
            size--;
            V toPop = head.val;
            head = head.next;
            return toPop;
        }

        public V peek() {
            if (head == null) {
                tail = null;
                return null;
            }
            return head.val;
        }

        public boolean isEmpty() {
            return size == 0;
        }
        public int size() {
            return size;
        }

        public void offer(V val) {
            Node<V> newNode = new Node<V>(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size ++;
        }

        public void traverse() {
            System.out.println("current queue's data:");
            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }
            tail = null;
            size = 0;
            System.out.println();
        }

        private static class Node<V> {
            V val;
            Node<V> next;

            public Node(V val) {
                this.val = val;
            }

            @Override
            public String toString() {
                return String.valueOf(val);
            }
        }

    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println("queue.size():" + queue.size());
        System.out.println("queue.isEmpty():" + queue.isEmpty());

        queue.traverse();

        queue.offer(1);
        queue.offer(2);
        System.out.println("peek:" + queue.peek());
        queue.offer(3);
        queue.offer(4);

        System.out.println("queue.size():" + queue.size());
        System.out.println("queue.isEmpty():" + queue.isEmpty());
        System.out.println("poping...");
        while (!queue.isEmpty()) {
            System.out.print(queue.pop() + " ");
            System.out.print("peek:" + queue.peek() + " ");
        }
        System.out.println();
    }





}
