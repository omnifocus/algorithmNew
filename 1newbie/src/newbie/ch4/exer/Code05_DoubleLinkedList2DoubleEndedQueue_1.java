package newbie.ch4.exer;

public class Code05_DoubleLinkedList2DoubleEndedQueue_1 {

    private static class Queue<V> {
        Node<V> head;
        Node<V> tail;
        int size;

        public void offerAtHead(V val) {
            Node<V> node = new Node<>(val);
            size++;
            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.next = head;
                head.pre = node;
                head = node;
            }
        }

        public V  pollAtTail() {
            if (tail == null) return null;
            V val = tail.val;
            if (tail == head) {
                tail = null;
                head = null;
                size = 0;
                return val;
            }
            tail = tail.pre;
            tail.next = null;
            return val;
        }

        public void offerAtTail(V val) {
            Node<V> node = new Node<>(val);
            size++;
            if (tail == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                node.pre = tail;
                tail = node;
            }
        }

        public V pollAtHead() {
            if (head == null) return null;
            V v = head.val;
            if (head == tail) {
                head = null;
                tail = null;
                size = 0;
                return v;
            }
            head = head.next;
            head.pre = null;
            size--;
            return v;
        }


        private static class Node<V> {
            V val;
            Node<V> pre;
            Node<V> next;

            public Node(V val) {
                this.val = val;
            }
        }

    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue();
        System.out.println("insert 1 2 3 at head:");
        queue.offerAtHead(1);
        queue.offerAtHead(2);
        queue.offerAtHead(3);
        System.out.println("pop at tail:");

        System.out.print(queue.pollAtTail() + " ");
        System.out.print(queue.pollAtTail() + " ");
        System.out.print(queue.pollAtTail() + " ");

        System.out.println();

        System.out.println("insert 1 2 3 at tail:");

        queue.offerAtTail(1);
        queue.offerAtTail(2);
        queue.offerAtTail(3);
        System.out.println("pop at head:");
        System.out.print(queue.pollAtHead() + " ");
        System.out.print(queue.pollAtHead() + " ");
        System.out.print(queue.pollAtHead() + " ");
        System.out.println();


        System.out.println();
    }


}
