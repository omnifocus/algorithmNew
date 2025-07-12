package ch4;

public class Code05_DoubleLinkedList2DoubleEndedQueue {

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

    private static class Queue<V> {
        Node<V> head;
        Node<V> tail;
        int size;


        private static class Node<V> {
            V val;
            Node<V> pre;
            Node<V> next;

            Node(V val) {
                this.val = val;
            }
        }

        private void offerAtHead(V val) {
            Node<V> node = new Node<>(val);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.next = head;
                head.pre = node;
                head = node;
            }
        }

        private void offerAtTail(V val) {
            Node<V> node = new Node<>(val);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.pre = tail;
                tail.next = node;
                tail = node;
            }
        }

        private V pollAtHead() {
            if (head == null) {
                tail = null;
                size = 0;
                return null;
            }
            V val = head.val;
            size--;
            // reaches at the last element
            if (head == tail) {
                head = null;
                tail = null;
                return val;
            }
            head = head.next;
            head.pre = null;

            return val;
        }

        private V pollAtTail() {
            if (tail == null) {
                head = null;
                size = 0;
                return null;
            }
            V val = tail.val;
            size--;
            if (tail == head) {
                head = null;
                tail = null;
                return val;
            }

            tail = tail.pre;
            tail.next = null;
            return val;
        }

        private boolean isEmpty() {
            return size == 0;
        }

        private int size() {
            return size;
        }

    }
}
