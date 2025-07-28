package ch6;

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
        Node<String> rootNode1 = constructTree();
        Node<String> rootNode2 = constructTree();
        System.out.println(isSameTree(rootNode1,rootNode2));

    }

    private static boolean isSameTree(Node<String> r1, Node<String> r2) {
        if (r1 == null ^ r2 == null) return false;
        if (r1 == null && r2 == null) return true;
        return r1.v == r2.v && isSameTree(r1.left,r2.left) && isSameTree(r1.right,r2.right);
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
