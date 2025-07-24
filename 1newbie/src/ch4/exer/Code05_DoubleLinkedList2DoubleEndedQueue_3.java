package ch4.exer;

public class Code05_DoubleLinkedList2DoubleEndedQueue_3 {

    private static class Queue<V> {
        Node<V> head,tail;

        public void offerAtHead(V v) {
            Node<V> node = new Node<>(v);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.next = head;
                head.pre = node;
                head = node;
            }
        }

        public V pollAtTail() {
            if (tail == null) return null;
            V v = tail.v;
            if (tail == head) {
                head = null;
                tail = null;
                return v;
            }
            tail = tail.pre;
            tail.next = null;
            return v;
        }

        public void offerAtTail(V v) {
            Node<V> node = new Node<>(v);
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
            V v = head.v;
            if (head == tail) {
                head = null;
                tail = null;
                return v;
            }
            head = head.next;
            head.pre = null;
            return v;
        }


        private static class Node<V> {
            V v;
            Node<V> pre;
            Node<V> next;
            Node(V v) {
                this.v = v;
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
