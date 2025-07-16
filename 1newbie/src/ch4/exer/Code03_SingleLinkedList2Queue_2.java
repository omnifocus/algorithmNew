package ch4.exer;

public class Code03_SingleLinkedList2Queue_2 {

    private static class Queue<V> {
        Node<V> head;
        Node<V> tail;
        int size;

        public void offer(V v) {
            Node<V> node = new Node<>(v);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public V peek() {
            if (head == null) return null;
            return head.v;
        }

        public V pop() {
            if (head == null) return null;
            V v = head.v;
            size--;
            head = head.next;
            return v;
        }

        public void traverse() {
            while(head != null) {
                System.out.print(pop() + " ");
            }
            System.out.println();
        }

        private static class Node<V> {
            V v;
            Node<V> next;

            public Node(V v) {
                this.v = v;
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
