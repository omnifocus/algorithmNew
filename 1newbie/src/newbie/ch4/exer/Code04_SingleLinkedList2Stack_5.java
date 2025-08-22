package newbie.ch4.exer;

/**
 *
 */
public class Code04_SingleLinkedList2Stack_5 {


    static class Node<T> {
        T val;
        Node<T> next;
        Node(T val) {
            this.val =val;
        }
    }

    static class Stack<T> {
        Node<T> head;

        void push(T t ) {
            Node<T> node = new Node<>(t);
            if (head == null) {
                head = node;
            } else {
                node.next = head;
                head = node;
            }
        }

        T pop() {
            if (head == null) return null;
            T val = head.val;
            head = head.next;
            return val;
        }

        void traverse() {
            while (head != null) {
                System.out.println(head.val);
                head = head.next;
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
