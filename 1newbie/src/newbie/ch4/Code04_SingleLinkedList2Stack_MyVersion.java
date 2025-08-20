package newbie.ch4;

public class Code04_SingleLinkedList2Stack_MyVersion {




    private static class Stack<V> {
        Node<V> head;
        Node<V> tail;
        int size;

        private static class Node<V> {
            V val;
            Node<V> next;

            public Node(V val) {
                this.val = val;
            }
        }

        public void push(V v) {
            Node<V> newNode = new Node<>(v);
            size++;
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                // must be put in else
                newNode.next = head;
                head = newNode;
            }


        }

        public V pop() {
            // when head is null,  clear state
            if (head == null) {
                tail = null;
                size = 0;
                return null;
            }
            V v = head.val;
            size --;
            head = head.next;
            return v;
        }

        public V peek() {
            if (head == null) return null;
            return head.val;
        }

        public int size() {
            return size;
        }


        public boolean isEmpty() {
            return size == 0;
        }

        public void traverse() {
            while (head != null) {
                System.out.print(pop() +" ");

            }
            System.out.println();
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
