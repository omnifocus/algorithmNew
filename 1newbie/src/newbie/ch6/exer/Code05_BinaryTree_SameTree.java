package newbie.ch6.exer;

/**
 https://leetcode.com/problems/same-tree/
 */
public class Code05_BinaryTree_SameTree {

    private static class Node<V> {
        V v;
        Node<V> left;
        Node<V> right;

        Node(V v) {
            this.v = v;
        }
    }

    public static void main(String[] args) {
        Node<String> rootNode = constructTree();

    }
    //TODO
    private static boolean isSameTree(Node<String> r1, Node<String> r2) {
        return false;
    }

    private static Node<String> constructTree() {
        Node<String> rootNode = new Node<>("A");
        rootNode.left = new Node<>("B");
        rootNode.right = new Node<>("C");
        rootNode.left.left = new Node<>("D");
        rootNode.left.right = new Node<>("E");
        rootNode.right.left = new Node<>("F");
        rootNode.right.right = new Node<>("G");
        return rootNode;
    }

}
