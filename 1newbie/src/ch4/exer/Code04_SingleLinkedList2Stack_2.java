package ch4.exer;

/**
 *
 */
public class Code04_SingleLinkedList2Stack_2 {



    private static class Stack<V> {
        Node<V> head;
        private static class Node<V> {
            V v ;
            Node<V> next;

            Node(V v ) {
                this.v = v;
            }
        }
        public void push(V v) {
            Node<V> node = new Node<>(v);
            if (head == null) {
                head = node;
            } else {
                node.next = head;
                head = node;
            }
        }

        public V pop() {
            if (head == null) return null;
            V v = head.v;
            head = head.next;
            return v;
        }
        public void traverse() {
            while (head != null) {
                System.out.print(pop() + " ");
            }
        }
    }


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.print("1 " );
        stack.push(2);
        System.out.print("2 " );
        stack.push(3);
        System.out.print("3 " );
        stack.push(4);
        System.out.print("4 " );
        stack.push(5);
        System.out.print("5 " );

        System.out.println();

        stack.traverse();



    }





}
