package ch4.exer;

public class Code03_SingleLinkedList2Queue_1 {

    private static class Queue<V> {
        Node<V> head;
        Node<V> tail;
        int size;

        public void offer(V v) {
            Node<V> newNode = new Node<>(v);
            size++;
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void traverse() {
            while (head != null) {
                System.out.print(pop() + " ");
            }
            System.out.println();
        }

        public V peek() {
            if (head == null) return null;
            return head.val;
        }

        public V pop() {
            if (head == null) {
                tail = null;
                size = 0;
                return null;
            }
            V val = head.val;
            size--;
            head = head.next;
            return val;

        }

        private static class Node<V> {
            V val;
            Node<V> next;

            public Node(V v) {
                this.val = v;
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
